#include <iostream>
#include <vector>
#include <string>
#include <map>
#include <algorithm>
using namespace std;

string input;

vector<char> dna;
vector<char> mrna;
vector<char> trna;

map<char, char> mRNA = {
    {'a', 'u'},
    {'t', 'a'},
    {'c', 'g'},
    {'g', 'c'}};

map<char, char> tRNA = {
    {'u', 'a'},
    {'a', 'u'},
    {'c', 'g'},
    {'g', 'c'}};


void transcribe()
{
    // Remove white spaces and convert to lowercase;
    for (char ch : input)
    {
        if (ch != ' ')
        {
            dna.push_back(tolower(ch));
        }
    }

    // Transcription
    for(char x : dna)
    {
        
        if(mRNA.find(x) == mRNA.end())
        {
            cout << "Unexpected DNA nucleotide" << endl;
        }
        mrna.push_back(mRNA[x]);
    }
}

void translate()
{
    if(input != "")
    {
        for(char x : mrna)
        {
            trna.push_back(tRNA[x]);
        }
    } 
    else
    {
        for (char x : input)
        {
            trna.push_back(tolower(tRNA[x]));
        }
    }

    //tRNA to codon
}

int main()
{
    int mode = 0;
    input = "";

    cout << "Choose which operation to do, 1 for Transcription, 2 for Translation, 3 for Both: " << endl;
    cin >> mode;

    switch(mode)
    {
    case 1:
        cout << "Enter DNA sequence: " << endl;
        getline(cin, input);

        transcribe();

        cout << endl;
        for(char x : mrna)
        {
            cout << (char) toupper(x);
        }
        break;

    case 2:
        cout << "Enter RNA sequence: " << endl;
        getline(cin, input);
        translate();
        break;

    default:
        cout << "Entered sequence invalid" << endl;
    }

    // Output
    cout << endl;
    for(char x : mrna)
    {
        cout << (char) toupper(x);
    }

}