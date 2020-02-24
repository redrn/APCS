#include <iostream>
using namespace std;

class Robot
{
public: 
    void move()
    {
        cout << "Robot moved" << endl;
    }
};

class Nancybot : public Robot
{
public:
    virtual void move(int i)
    {
        cout << "Nancybot moved" << endl;
    }
};

class Dancebot : public Nancybot
{
private:
    typedef Nancybot super;

public:
    void move()
    {
        super::move(1);
    }

    void move(int i)
    {
        cout << "Dancebot moved" << endl;
    }
};

int main()
{
    Dancebot d;
    d.move();

    Nancybot *d_ptr = new Dancebot();
    d_ptr->move(1);
}