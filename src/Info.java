import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;



class Info {
    Scanner scan;
    String name;
    String address;
    long contact;
    int age;
    String bg;
    String sex;
    String disease;
    long id;
    String date;

    Info()
    {
        this.scan = new Scanner(System.in);
        System.out.print("\t\t\t\t\t ___________________________________________________________________________________________\n");
        System.out.print("\t\t\t\t\t|                                           \t\t                                        |\n");
        System.out.print("\t\t\t\t\t|                                           \t\t                                        |\n");
        System.out.print("\t\t\t\t\t|                                           \t\t                                        |\n");
        System.out.print("\t\t\t\t\t|                                           \t\t                                        |\n");
        System.out.print("\t\t\t\t\t|                                           \t\t                                        |\n");
        System.out.print("\t\t\t\t\t|                                           \t\t                                        |\n");
        System.out.print("\t\t\t\t\t|                            Welcome to EHospital                                           |\n");
        System.out.print("\t\t\t\t\t|                                                                                           |\n");
        System.out.print("\t\t\t\t\t|                                                                                           |\n");
        System.out.print("\t\t\t\t\t|                                                                                           |\n");
        System.out.print("\t\t\t\t\t|                                                                                           |\n");
        System.out.print("\t\t\t\t\t|                                                                                           |\n");
        System.out.print("\t\t\t\t\t|                                                                                           |\n");
        System.out.print("\t\t\t\t\t|                                                                                           |\n");
        System.out.print("\t\t\t\t\t|                                                                                           |\n");
        System.out.print("\t\t\t\t\t|___________________________________________________________________________________________|\n");
    }

    private void pressAnyKeyToContinue() {
        System.out.println("Press Enter key to continue...");

        try {
            System.in.read();
        } catch (Exception var2) {
            System.out.println("Press 'Enter' key to continue!");
        }
    }
    String readString() {
        Scanner var1 = new Scanner(System.in);
        return var1.nextLine();
    }

    void login() {
        System.out.print("\t\t\t\t\t _______________________________________________________________________________________ \n");
        System.out.print("\n\t\t\t\t\t\t\t\tEHospital \n");
        System.out.print("\t\t\t\t\t _______________________________________________________________________________________ \n");
        System.out.println("\n\n\t\t\t\t\t\t\t\t------------------------------");
        System.out.print("\n\t\t\t\t\t\t\t\t\t     LOGIN \n");
        System.out.print("\t\t\t\t\t\t\t\t------------------------------\n\n");
        System.out.print("\t\t\t\t\t\t\t\tEnter the Password: ");
        String var2 = this.scan.next();
        if (var2.equals("6224")) {
            System.out.print("\n\n\t\t\t\t\t\t\t\tРазрешен достъп!\n");
            this.pressAnyKeyToContinue();
        } else
        {
            System.out.print("\n\n\t\t\t\t\t\t\t\tДостъпът е ограничен...\n\t\t\t\t\t\t\t\t1.Назад\n\n\t\t\t\t\t\t\t\t2.Изход");
            System.out.print("\n\n\t\t\t\t\t\t\tВъведете опция: ");

            try
            {
                int var1 = this.scan.nextInt();
                if (var1 == 1) {
                    this.login();
                } else if (var1 == 2) {
                    System.exit(0);
                } else {
                    System.out.print("\n\n\t\t\t\t\t\tНевалиден избор\n");
                }
            } catch (InputMismatchException var4)
            {
                System.out.println("\n\n\t\t\t\t\t\t\t*Въведете една от изброените опции!*\n\n");
                this.login();
            }
        }
    } public void getCurrentTimeUsingDate()
    {
        DateTimeFormatter var1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime var2 = LocalDateTime.now();
        this.date = var1.format(var2);
    }
    void menu()
    {
        System.out.print("\t\t\t\t\t _______________________________________________________________________________________ \n");
        System.out.print("\n\n\t\t\t\t\t\t\t\t  EHospital \n\n");
        System.out.print("\t\t\t\t\t _______________________________________________________________________________________ \n");
        System.out.print("\n\n\t\t\t\t\t\tМоля изберете една от опциите: \n\n");
        System.out.print("\t\t\t\t\t\t _________________________________________________________________ \n");
        System.out.print("\t\t\t\t\t\t*                                           \t                  *\n");
        System.out.print("\t\t\t\t\t\t*             1  >> Добави нов пациент                            *\n");
        System.out.print("\t\t\t\t\t\t*             2  >> Добави диагноза на съществуващ пациент        *\n");
        System.out.print("\t\t\t\t\t\t*             3  >> История на пациент                            *\n");
        System.out.print("\t\t\t\t\t\t*             4  >> Сметка на пациент                             *\n");
        System.out.print("\t\t\t\t\t\t*             5  >> Изход\t\t                                  *\n");
        System.out.print("\t\t\t\t\t\t*                                                                 *\n");
        System.out.print("\t\t\t\t\t\t*_________________________________________________________________*\n\n");
        System.out.print("\t\t\t\t\t\tВъведете опция: ");
        char var1 = this.scan.next().charAt(0);
        switch(var1) {
            case '1':
                this.patient();
                break;
            case '2': diagnos();
                break;
            case '3': history();
                break;
            case '4': bill();
                break;
            default:
                System.out.print("\n\n\t\t\t\t\t\tНевалиден избор\n");
                System.out.print("\t\t\t\t\t\tОпитайте пак...........\n\n");
        }
        pressAnyKeyToContinue();
        this.menu();
    }
    void patient()
    {
        System.out.print("Въведете име на файла на пациента: ");
        String var1 = this.scan.next();
        this.getCurrentTimeUsingDate();

        try
        {
            FileWriter var2 = new FileWriter(var1 + ".bin");
            BufferedWriter var3 = new BufferedWriter(var2);
            System.out.print("\n********************************************************************\n");
            var3.write("Дата на постъпване: " + this.date);
            var3.newLine();
            System.out.print("\nИме : ");
            this.name = this.readString();
            var3.write("име : " + this.name);
            var3.newLine();
            System.out.print("\nАдрес : ");
            this.address = this.readString();
            var3.write("Aдрес : " + this.address);
            var3.newLine();
            System.out.print("\nНомер за връзка : ");
            this.contact = this.scan.nextLong();
            var3.write("Номер за връзка : " + this.contact);
            var3.newLine();
            System.out.print("\nГодини : ");
            this.age = this.scan.nextInt();
            var3.write("Години : " + this.age);
            var3.newLine();
            System.out.print("\nПол : ");
            this.sex = this.scan.next();
            var3.write("Пол : " + this.sex);
            var3.newLine();
            System.out.print("\nКръвна група : ");
            this.bg = this.scan.next();
            var3.write("Кръвна група : " + this.bg);
            var3.newLine();
            System.out.print("\nПреболедувал ли е някаква болест наскоро : ");
            this.disease = this.readString();
            var3.write("Преболедувал ли е някаква болест наскоро : " + this.disease);
            var3.newLine();
            System.out.print("\nКод на Пациент : ");
            this.id = this.scan.nextLong();
            var3.write("Код на Пациент : " + this.id);
            var3.newLine();
            System.out.print("\n********************************************************************\n");
            var3.write("\n********************************************************************\n\n");
            var3.newLine();
            System.out.print("\nИнформацията е запазена успешно\n");
            var3.close();
        } catch (IOException var4) {
            System.out.println("Грешка при запазване на файла '" + var1 + "'");
        }
        this.pressAnyKeyToContinue();
    }
    void diagnos()
    {
        String symptom;
        String diagnosis;
        String medicine;
        String addmission;
        String ward;
        String doctor;
        getCurrentTimeUsingDate();
        System.out.print("\n\nВъведете името на файла на пациент за да бъде отворен : ");
        String fileName=scan.next();
        String line = null;
        try {
            FileReader fileReader = new FileReader(fileName+".bin");

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println("\n\n\n\n\t\t\t\t........................................ Информация за '"+fileName+"' ........................................\n\n\n\n");
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }

            bufferedReader.close();
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName+".txt", true)));
            System.out.print("Добавяне на повече информация за файла на пациента................на дата : "+date);
            System.out.println("Дата:"+date);
            System.out.print("\nНазначен доктор:");doctor=readString();out.println("Doctor appointed: "+doctor);
            System.out.print("\nСимптоми : ");symptom=readString();out.println("Symptoms : "+symptom);
            System.out.print("\nДиагноза : "); diagnosis=readString();out.println("Diagnosis : "+diagnosis);
            System.out.print("\nПредписани лекарства : ");medicine=readString(); out.println("Medicines : "+medicine);
            System.out.print("\nТрябва ли да бъде наглеждан? : ");
            addmission=readString();out.println("Трябва ли да бъде наглеждан? : "+addmission);
            if(addmission.equals("Да")||addmission.equals("Y"))
            {
                System.out.print("\nТип отделение : ");ward=readString(); out.println("Тип отделение : "+ward);
                out.println("\n*************************************************************************\n");
                System.out.print(ward+" Успешно разпределен в отделение!\n");
            }
            else
            {out.println("*************************************************************************\n");}
            System.out.close();
            pressAnyKeyToContinue();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Файлът не може да бъде намерен или не може да се отвори '" + fileName + "'");
        }
        catch (IOException e) {
            System.out.println("Грешка при писане на файла '"+ fileName +"'");
        }
    }




    void history()
    {
        System.out.print("\n\nВъведете името на файла на пациент : ");
        String fileName=scan.next();
        String line = null;
        try {
            FileReader fileReader = new FileReader(fileName+".bin");

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.print("\n\n\n\n\t\t\t\t........................................ Пълна история за пациент:  '"+fileName+"' ........................................\n\n\n\n");
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
            pressAnyKeyToContinue();

            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Файлът не може да бъде намерен или не може да се отвори '" + fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Грешка при четене на файла '" + fileName + "'");
        }
    }
    void bill()
    {
        getCurrentTimeUsingDate();
        int days;
        double wcharge;
        double doc;
        double ser;
        System.out.println("\t\t\t\t\t\t _________________________________________________________________ ");
        System.out.print("\n\n\t\t\t\t\t\t\t\t  Електронна болница \n\n");
        System.out.println("\t\t\t\t\t\t _________________________________________________________________ ");
        System.out.print("Въведете името на файла на пациент: ");
        String fileName=scan.next();
        String line = null;
        try {

            FileReader fileReader = new FileReader(fileName+".bin");
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName+".bin", true)));


            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.print("Дата: "+date);
            System.out.println("\n\n\n\n\t\t\t\tДетайли за пациент:\n\n\n\n");
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
            System.out.print("\t\t\t\t\t\t _________________________________________________________________ ");
            System.out.println("\n\t\t\t\t\t\t\t\t\tСметката на пациента: ");
            System.out.print("\t\t\t\t\t\t _________________________________________________________________ \n\n");
            System.out.print("\t\t\t\t\t\tДни престой:");days=scan.nextInt();
            System.out.print("\t\t\t\t\t\tСметка за престояване в отделение/ на ден: ");wcharge=scan.nextDouble();
            System.out.print("\n\t\t\t\t\t\tОбща сметка за престой в отделение: "+(wcharge*days));
            System.out.print("\n\t\t\t\t\t\tТакса за доктор: ");doc=scan.nextDouble();
            System.out.print("\n\t\t\t\t\t\tТакса за услуги: ");ser=scan.nextDouble();
            System.out.print("\n\t\t\t\t\t\tОбща сметка: "+((wcharge*days)+doc+ser) + "лева");
            System.out.print("\n\t\t\t\t\t\t _________________________________________________________________ \n");
            System.out.close();
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Файлът не може да бъде намерен или не може да се отвори " + fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Грешка при четене на файла " + fileName + "'");
        }
        pressAnyKeyToContinue();
    }

}

