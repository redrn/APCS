#include <iostream>
#include <vector>
using namespace std;

template<typename T>
T sum(T a, T b)
{
    return a + b;
}

template <typename T>
T Max(T a, T b)
{
    if(a < b) {
        return b;
    }
    else {
        return a;
    }
}

template <class T>
class Stack
{
    T elements[3];

public:
    Stack(T elem[3])
    {
        for (int i = 0; i < 3; i++)
        {
            elements[i] = elem[i];
        }
    }

    void printElem()
    {
        for (int i = 0; i < 3;i++)
        {
            cout << elements[i];
        }
    }
};

int main()
{
    int integers[] = {1, 2, 3};
    Stack<int> intStack(integers);
    intStack.printElem();

    char chars[] = {'a', 'b', 'c'};
    Stack<char> charStack(chars);
    charStack.printElem();

    return 0;
}