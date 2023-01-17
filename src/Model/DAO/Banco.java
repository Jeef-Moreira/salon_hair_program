package Model.DAO;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;
import java.util.ArrayList;

public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Servico> servico;
    public static ArrayList<Agendamento> agendamento;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        cliente = new ArrayList<Cliente>();
        servico = new ArrayList<Servico>();
        agendamento = new ArrayList<Agendamento>();
        
        //criando elementos
        
        Usuario usuario1 = new Usuario(1, "jefferson", 'M', "05/06/2000", "30212121", "medusalonhair@gmail.com", "521454123", "jefferson", "administrador");
        Usuario usuario2 = new Usuario(2, "vitoria", 'F', "09/05/1996", "30212122", "estagiario@barbershop.com", "451244123", "vitoria", "funcionario");
         
        Cliente cliente1 = new Cliente(1, "Alan Figueiredo", 'M', "30/01/1995", "30212126", "alanfigueiredo02@gmail.com", "5142487", "Rua jaboti 35 Canudos NH",  "93300012");
        Cliente cliente2 = new Cliente(2, "Judite Oliveira", 'F', "30/08/1994", "30212127", "juditeoliveirapet@gmail.com", "5142487745", "Rua campo bom 78 Centro NH",  "93300045");
        Cliente cliente3 = new Cliente(3, "Paulo Ricado", 'M', "24/04/1997", "30212128", "pauloricardopet@gmail.com", "78451458", "Rua Tres Irmaos 30 Vila Nova - NH",  "933007496");
        Cliente cliente4 = new Cliente(4, "Neymar Santos", 'M', "20/08/1995", "30212130", "neymarsantospet@gmail.com", "2745487", "Rua Lombardi 40 Canudos NH",  "93300748");
        Cliente cliente5 = new Cliente(5, "Debruine Pipoqueiro", 'M', "13/09/1992", "30212131", "debruinepet@gmail.com", "4742487", "Rua pedro quaresma 784 Canudos Belgica",  "933000847");
        Cliente cliente6 = new Cliente(6, "Maria Pereira", 'M', "17/08/1994", "302122324", "matuidipet@gmail.com", "78512457", "Rua champions 10 Kephas Franca",  "933000782");
        Cliente cliente7 = new Cliente(7, "Marta de Souza", 'F', "25/03/1993", "302121292", "martasouzapet@gmail.com", "4658237314", "Rua tesla 215 Canudos NH",  "93352012");
        Cliente cliente8 = new Cliente(8, "Aline Ferrari", 'F', "04/03/1990", "302121451", "alineferraripet@gmail.com", "8475123687", "Rua hyrule 32 Canudos NH",  "9334714747");
        Cliente cliente9 = new Cliente(9, "Samuel Coltinho", 'M', "09/02/1998", "302121189", "samuelcoltinhopet@gmail.com", "74595142487", "Rua floresta 12 Canudos NH",  "9330046364");
        Cliente cliente10 = new Cliente(10, "Felipe Luis", 'M', "12/06/1999", "302121247", "felipeluispet@gmail.com", "845713647", "Rua marechal 1023 Canudos NH",  "933000874");
        Cliente cliente11 = new Cliente(11, "Gustavo Soares", 'M', "08/01/1999", "302121249", "gustavosoarespet@gmail.com", "925719532", "Rua assuncao marques 8004 Taua CE",  "933000854");
        
        
        Servico servico1 = new Servico(1, "Corte Simples", 18);
        Servico servico2 = new Servico(2, "Corte Degrade", 25);
        Servico servico3 = new Servico(3, "Barba Simples", 15);
        Servico servico4 = new Servico(4, "Barba Desenhada", 22);
        Servico servico5 = new Servico(5, "Sombrancelhas", 60);
        Servico servico6 = new Servico(6, "Penteados Feminino", 40);
        Servico servico7 = new Servico(7, "Aplicação de Ampola", 20);
        Servico servico8 = new Servico(8, "Botox Capilar", 120);
        Servico servico9 = new Servico(9, "Cauterização a Frio", 180);
        Servico servico10 = new Servico(10, "Celophane", 120);
        Servico servico11 = new Servico(11, "Coloração", 100);
        Servico servico12 = new Servico(12, "Corte com Gil Madureira", 160);
        Servico servico13 = new Servico(13, "Corte Feminino", 150);
        Servico servico14 = new Servico(14, "Escova", 70);
        Servico servico15 = new Servico(15, "Escova Catiônica", 120);
        Servico servico16 = new Servico(16, "Escova Definitiva", 400);
        Servico servico17 = new Servico(17, "Escova Inteligente", 180);
        Servico servico18 = new Servico(18, "Escova Reconstrutiva", 160);
        Servico servico19 = new Servico(19, "Escova Reestruturante", 160);
        Servico servico20 = new Servico(20, "Henna", 25);
        Servico servico21 = new Servico(21, "Barba Simples", 80);
        Servico servico22 = new Servico(22, "Design Sobrancelha", 50);
        Servico servico23 = new Servico(23, "Micropigmentação Fio a Fio", 170);
        Servico servico24 = new Servico(24, "Micropigmentação Labial", 100);
        Servico servico25 = new Servico(25, "Neutralização Labial", 90);
        Servico servico26 = new Servico(26, "Hidratação", 100);
        Servico servico27 = new Servico(27, "Hidratação de Queratina", 140);
        Servico servico28 = new Servico(28, "Initialiste Kérastase", 220);
        Servico servico29 = new Servico(29, "Shampoo (Lavagem)", 20);
        Servico servico30 = new Servico(30, "Mechas", 150);
        Servico servico31 = new Servico(31, "Limpeza de Pele", 70);
        Servico servico32 = new Servico(32, "Tintura Inoa", 130);
        Servico servico33 = new Servico(33, "Penteado Noiva", 200);
        Servico servico34 = new Servico(34, "Penetrait", 260);
 

        Agendamento agendamento1 = new Agendamento(1, cliente1, servico2, 30, "14/07/2018 09:30");
        Agendamento agendamento2 = new Agendamento(2, cliente3, servico4, 40, "14/07/2018 10:00");
        Agendamento agendamento3 = new Agendamento(3, cliente4, servico1, 18, "14/07/2018 10:30");
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        cliente.add(cliente6);
        cliente.add(cliente7);
        cliente.add(cliente8);
        cliente.add(cliente9);
        cliente.add(cliente10);
        cliente.add(cliente11);
        
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        servico.add(servico5);
        servico.add(servico6);
        servico.add(servico7);
        servico.add(servico8);
        servico.add(servico9);
        servico.add(servico10);
        servico.add(servico11);
        servico.add(servico12);
        servico.add(servico13);
        servico.add(servico14);
        servico.add(servico15);
        servico.add(servico16);
        servico.add(servico17);
        servico.add(servico18);
        servico.add(servico19);
        servico.add(servico20);
        servico.add(servico21);
        servico.add(servico22);
        servico.add(servico23);
        servico.add(servico24);
        servico.add(servico25);
        servico.add(servico26);
        servico.add(servico27);
        servico.add(servico28);
        servico.add(servico29);
        servico.add(servico30);
        servico.add(servico31);
        servico.add(servico32);
        servico.add(servico33);
        servico.add(servico34);
        
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);
        
    }
    
    
}
