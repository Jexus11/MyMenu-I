package com.ocr.anthony;

public class Order {
    /**
     * Display all available menus in the restaurant.
     */
    public void displayAvailableMenu() {
        System.out.println("Choix menu");
        System.out.println("1 - Poulet");
        System.out.println("2 - Boeuf");
        System.out.println("3 - Végétarien");
        System.out.println("Que souhaitez-vous comme menu ?");
    }
    /**
     * Display a selected menu.
     * @param nbMenu The selected menu.
     */
    public void displaySelectedMenu(int nbMenu) {
        if(nbMenu == 1){
            System.out.println("Vous avez choisi le menu au poulet !");
        }else if(nbMenu == 2){
            System.out.println("Vous avez choisi le menu au boeuf !");
        }else if(nbMenu == 3){
            System.out.println("Vous avez choisi le menu au végétarien !");
        }else{
            System.out.println("Ce n'est pas un menu de la carte !");
        }
    }
}