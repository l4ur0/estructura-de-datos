#ifndef ahorcado_H
#define ahorcado_H
#include <iostream>
#include <string>
#include <cstdlib>
#include <vector>
#include <time.h>
using namespace std;


class ahorcado
{
    public:
        ahorcado();

        void mein();

        void mostrar();//orientar a objetos
        void ingresar(char x);//orientar a objetos;
        void inicializar();
        string obtener_palabra_aleatoria();

    protected:

    private:
};

#endif // ahorcado_H
