package org.example.infraestructure;

import org.example.application.implement.AbogadoImpAdapter;
import org.example.application.implement.RepositoryAbogado;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        //este es un ejemplo basico pero legible, falta que las capas se comuniquen con DTOS

        //Dependencias
        //RepositoryAbogado repo = new RepoInMemoryAdapter();
        //RepositoryAbogado repo = new RepoInMemoryAdapter2();
        RepositoryAbogado repo = new RepoAdapterAPIExterior();
        //esto funciona porque estas dos clases implementar la interfaz de la application

        //Ya no necesito que el tipo sea una interfaz porque ahi
        //termina to-do, ya no hay mas abstracion
        //esto tiene que ser una implementacion concreta, porque esto ya es funcional
        AbogadoImpAdapter app = new AbogadoImpAdapter(repo);
        System.out.println(app.listaAbogados());
        app.nuevoAbogado("Juanito");
        System.out.println(app.listaAbogados());

        //ya no estoy usando la capa de dominio
    }
}