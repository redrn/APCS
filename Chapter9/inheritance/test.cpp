#include <iostream>
#include <vector>
using namespace std;

class base
{
public:
    virtual void print()
    {
        cout << "print base class" << endl;
    }

    void show()
    {
        cout << "show base class" << endl;
    }
};

class derived : public base
{
public:
    virtual void print()
    {
        cout << "print derived class" << endl;
    }

    void show()
    {
        cout << "show derived class" << endl;
    }
};

class doublederived : public derived
{
    void print()
    {
        cout << "print doublederived class" << endl;
    }
};

int main()
{
    base *bptr;
    derived d;
    bptr = &d;

    // virtual function, binded at runtime
    bptr->print();

    // Non-virtual function, binded at compile time
    bptr->show();

    vector<derived*> vec;
    vec.push_back(new derived());

    derived *devptr = vec[0];
    vec.erase(vec.begin());

    devptr->show();
}