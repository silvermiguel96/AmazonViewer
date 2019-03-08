package com.miguelangel.amazonviewer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.miguealangel.makereport.Report;
import com.miguelangel.amazonviewer.model.Book;
import com.miguelangel.amazonviewer.model.Chapter;
import com.miguelangel.amazonviewer.model.Movie;
import com.miguelangel.amazonviewer.model.Serie;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		showMenu();
	}
	
	public static void showMenu() {
		int exit = 0;
		do {
			System.out.println("BIENVENIDOS AMAZON VIEWER");
			System.err.println("");
			System.out.println("Selecciona el numero de la opcion deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Reportes");
			System.out.println("6. Reportes del dia");
			System.out.println("0. Exit");
			
			// Leer la respuesta del usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
					
			switch (response) {
			case 0:
				System.out.println("Gracias por visitarnos!");

			break;
			case 1:
				showMovies();
			break;
			case 2:
				showSeries();
			break;
			case 3:
				showBooks();
			break;
			case 4:
				showMagazines();
			break;
			case 5:
				makeReport();
			break;
			case 6:
				makeReport(new Date());
			break;

			default:
				System.out.println("La opcion no es valida");
			break;
			}
			break;
		}while(exit != 0);
	}
	
	public static void showMovies() {
		int exit = 1;
		ArrayList<Movie> movies = Movie.makeMoviesList();
		do {
			System.out.println();
			System.out.println(":: MOVIES ::");
			System.out.println();
			
			for (int i = 0; i < movies.size(); i++) {
				System.out.println(i+1 + ". " + movies.get(i).getTitle() + " Visto: " + movies.get(i).isViewed() );
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			// Leer Respuesta usuario
			
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
				showMenu();
			}
			Movie movieSelected = movies.get(response-1);
			movieSelected.setViewed(true);
			Date dateI = movieSelected.startToSee(new Date());
			
			
			for (int i = 0; i < 100000; i ++) {
				System.out.println("........");
			}
			// Terminar de verla
			movieSelected.stopToSee(dateI, new Date());
			System.out.println();
			System.out.println("Viste :" + movieSelected);
			System.out.println("Por: " + movieSelected.getTimeViewed() +  "Milisegundos");
			
			
		}while(exit != 0);
	}
	public static void showSeries() {
		int exit = 1;
		ArrayList<Serie> series = Serie.makeSeriesList();
		do {
			System.out.println();
			System.out.println(":: SERIES ::");
			System.out.println();
			
			for (int i = 0; i < series.size(); i++) { //1. Serie 1
				System.out.println(i+1 + ". " + series.get(i).getTitle() + " Visto: " + series.get(i).isViewed());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
				showMenu();
			}
			
			showChapters(series.get(response-1).getChapters());
			
		}while(exit !=0);
	}
	public static void showChapters(ArrayList<Chapter> chaptersOfSerieSelected) {
int exit = 0;
		
		do {
			System.out.println();
			System.out.println(":: CHAPTERS ::");
			System.out.println();
			
			
			for (int i = 0; i < chaptersOfSerieSelected.size(); i++) { //1. Chapter 1
				System.out.println(i+1 + ". " + chaptersOfSerieSelected.get(i).getTitle() + " Visto: " + chaptersOfSerieSelected.get(i).isViewed());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
				showSeries();
			}
			
			Chapter chapterSelected = chaptersOfSerieSelected.get(response-1);
			chapterSelected.setViewed(true);
			Date dateI = chapterSelected.startToSee(new Date());
			
			for (int i = 0; i < 100000; i++) {
				System.out.println("..........");
			}
			
			//Termine de verla
			chapterSelected.stopToSee(dateI, new Date());
			System.out.println();
			System.out.println("Viste: " + chapterSelected);
			System.out.println("Por: " + chapterSelected.getTimeViewed() + " milisegundos");
		}while(exit !=0);
	}
	public static void showBooks() {
		int exit = 0;
		ArrayList<Book> books= Book.makeBookList();
		do {
			System.out.println();
			System.out.println(":: BOOKS ::");
			System.out.println();
			
			for (int i = 0; i < books.size(); i++) { //1. Movie 1
				System.out.println(i+1 + ". " + books.get(i).getTitle() + " Visto: " + books.get(i).isReaded());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
				showMenu();
			}
			
			Book bookSelected = books.get(response-1);
			bookSelected.setReaded(true);
			Date dateI = bookSelected.startToSee(new Date());
			
			for (int i = 0; i < 100000; i++) {
				System.out.println("..........");
			}
			
			//Termine de verla
			bookSelected.stopToSee(dateI, new Date());
			System.out.println();
			System.out.println("Viste: " + bookSelected);
			System.out.println("Por: " + bookSelected.getTimeReaded() + " milisegundos");
		}while(exit !=0);
	}
	public static void showMagazines() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: MAGAZINES ::");
			System.out.println();
		}while(exit != 0);
	}
	
	public static void makeReport() {
		
		Report report = new Report();
		report.
		
	}
	
	public static void makeReport(Date date) {
		
	}
}