package tk.raphaels.controller;

public class PessoaController {
     public Boolean Podevotar(int idade){
         if (idade >= 16){
             return true;
         }else{
             return false;
         }
     }

 }

