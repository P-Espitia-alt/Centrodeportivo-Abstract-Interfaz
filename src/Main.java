import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        List<Atleta> atletas = new ArrayList<>();

        Atleta a1 = new Ciclista("Sofia", 18, 18, 20, 1);
        Atleta a2 = new Boxeador("Erika", 17, 10, 110, 150);
        Atleta a3 = new Voleibolista("Toriello", 10, 8, 5, 7);
        atletas.add(a1);
        atletas.add(a2);
        atletas.add(a3);

        while (true){
            System.out.println("" + '\n' +
                    "Sistema de atletas"+'\n'+
                    "Digite"+'\n'+
                    "1. para registrar un atleta"+'\n'+
                    "2. para mostrar la informacion completa del atleta"+'\n'+
                    "3. para mostrar el atleta con mejor rendimiento"+'\n'+
                    "0. para salir");
            int op0= tc.nextInt();
            if (op0==0){
                System.out.println("Vuelva pronto" + '\n' +
                        "Saliendo...");
                break;
            }
            switch (op0){
                case 1:
                    System.out.println("1. para registrar un atleta");
                    while (true) {
                        System.out.println("Sistema de atletas"+'\n'+
                                "Digite"+'\n'+
                                "1. para registrar a un ciclista"+'\n'+
                                "2. para registrar un boxeador"+'\n'+
                                "3. para registrar a un voleibolista"+'\n'+
                                "0. para salir");
                        int op1= tc.nextInt();
                        if (op1==0){
                            System.out.println("Volviendo al menu principal...");
                            break;
                        }
                        switch (op1){
                            case 1:
                                tc.nextLine();
                                System.out.println("1. para registrar a un ciclista");
                                System.out.println("Nombre");
                                String n1=tc.nextLine();
                                System.out.println("Edad");
                                int ed=tc.nextInt();
                                System.out.println("Horas de Entrenamiento");
                                double hE= tc.nextDouble();
                                System.out.println("Kilometros Recorridos");
                                double kR= tc.nextDouble();
                                System.out.println("Tiempo");
                                double t= tc.nextDouble();
                                Atleta ac= new Ciclista(n1,ed,hE, kR, t);
                                atletas.add(ac);
                                break;
                            case 2:
                                tc.nextLine();
                                System.out.println("2. para registrar un boxeador");
                                System.out.println("Nombre");
                                String n=tc.nextLine();
                                System.out.println("Edad");
                                int edad=tc.nextInt();
                                System.out.println("Horas de Entrenamiento");
                                double horasE= tc.nextDouble();
                                System.out.println("Golpes Acestados");
                                int gA= tc.nextInt();
                                System.out.println("Peleas Ganadas");
                                int pG= tc.nextInt();
                                Atleta ab= new Boxeador(n,edad,horasE, gA, pG);
                                atletas.add(ab);
                                break;
                            case 3:
                                tc.nextLine();
                                System.out.println("3. para registrar a un voleibolista");
                                System.out.println("Nombre");
                                String n3=tc.nextLine();
                                System.out.println("Edad");
                                int age=tc.nextInt();
                                System.out.println("Horas de Entrenamiento");
                                double horaE= tc.nextDouble();
                                System.out.println("Saques Efectivos");
                                int sE= tc.nextInt();
                                System.out.println("Bloqueos");
                                int b= tc.nextInt();
                                Atleta av= new Boxeador(n3,age,horaE, sE, b);
                                atletas.add(av);
                                break;
                            default:
                                    break;
                        }

                    }
                    break;
                case 2:
                    System.out.println("2. para mostrar la informacion completa de los atletas");
                    for(Atleta p : atletas){
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.println("3. para mostrar el atleta con mejor rendimiento");
                    double mayor= atletas.get(0).calcularRendimiento();
                    int mejorRendimiento=0;
                    for (int i=0; i < atletas.size(); i++){
                        double rendimiento= atletas.get(i).calcularRendimiento();
                        if (rendimiento> mayor){
                            mayor=rendimiento;
                            mejorRendimiento=i;
                        }
                    }
                    System.out.println("El atleta con mejor rendimiento es:");
                    System.out.println(atletas.get(mejorRendimiento).toString());
                    System.out.println("Rendimiento:"+mejorRendimiento);
                    break;
                default:
                    break;
            }
        }

    }
}