import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

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
    String dadm;

    Info() {
        this.scan = new Scanner(System.in);
        System.out.print("\t\t\t\t\t ___________________________________________________________________________________________\n");
        System.out.print("\t\t\t\t\t|                                           \t\t                                    |\n");
        System.out.print("\t\t\t\t\t|                                           \t\t                                    |\n");
        System.out.print("\t\t\t\t\t|                                           \t\t                                    |\n");
        System.out.print("\t\t\t\t\t|                                           \t\t                                    |\n");
        System.out.print("\t\t\t\t\t|                                           \t\t                                    |\n");
        System.out.print("\t\t\t\t\t|                                           \t\t                                    |\n");
        System.out.print("\t\t\t\t\t|                            WELCOME TO E-HEALTH CARE MANAGEMENT SYSTEM                     |\n");
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
        System.out.print("\n\t\t\t\t\t\t\t\tE-HEALTH CARE MANAGEMENT SYSTEM \n");
        System.out.print("\t\t\t\t\t _______________________________________________________________________________________ \n");
        System.out.println("\n\n\t\t\t\t\t\t\t\t------------------------------");
        System.out.print("\n\t\t\t\t\t\t\t\t\t     LOGIN \n");
        System.out.print("\t\t\t\t\t\t\t\t------------------------------\n\n");
        System.out.print("\t\t\t\t\t\t\t\tEnter the Password: ");
        String var2 = this.scan.next();
        if (var2.equals("1234")) {
            System.out.print("\n\n\t\t\t\t\t\t\t\tРазрешен достъп!\n");
            this.pressAnyKeyToContinue();
        } else {
            System.out.print("\n\n\t\t\t\t\t\t\t\tДостъпът е ограничен...\n\t\t\t\t\t\t\t\t1.Назад\n\n\t\t\t\t\t\t\t\t2.Изход");
            System.out.print("\n\n\t\t\t\t\t\t\tВъведете опция: ");

            try {
                int var1 = this.scan.nextInt();
                if (var1 == 1) {
                    this.login();
                } else if (var1 == 2) {
                    System.exit(0);
                } else {
                    System.out.print("\n\n\t\t\t\t\t\tНевалиден избор\n");
                }
            } catch (InputMismatchException var4) {
                System.out.println("\n\n\t\t\t\t\t\t\t*Въведете една от изброените опции!*\n\n");
                this.login();
            }
        }

    }

    public void getCurrentTimeUsingDate() {
        DateTimeFormatter var1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime var2 = LocalDateTime.now();
        this.dadm = var1.format(var2);
    }

    void menu() {
        System.out.print("\t\t\t\t\t _______________________________________________________________________________________ \n");
        System.out.print("\n\n\t\t\t\t\t\t\t\t  E-HEALTH CARE MANAGEMENT SYSTEM \n\n");
        System.out.print("\t\t\t\t\t _______________________________________________________________________________________ \n");
        System.out.print("\n\n\t\t\t\t\t\tМоля изберете една от опциите: \n\n");
        System.out.print("\t\t\t\t\t\t _________________________________________________________________ \n");
        System.out.print("\t\t\t\t\t\t*                                           \t                  *\n");
        System.out.print("\t\t\t\t\t\t*             1  >> Добави нов пациент                        *\n");
        System.out.print("\t\t\t\t\t\t*             2  >> Добави диагноза на съществуващ пациент        *\n");
        System.out.print("\t\t\t\t\t\t*             3  >> История на пациент                        *\n");
        System.out.print("\t\t\t\t\t\t*             4  >> Сметка на пациент                          *\n");
        System.out.print("\t\t\t\t\t\t*             5  >> Помощ\t\t\t\t                          *\n");
        System.out.print("\t\t\t\t\t\t*             6  >> Изход\t\t                                  *\n");
        System.out.print("\t\t\t\t\t\t*_________________________________________________________________*\n\n");
        System.out.print("\t\t\t\t\t\tВъведете опция: ");
        char var1 = this.scan.next().charAt(0);
        switch(var1) {
            case '1':
                this.patient();
                break;
            case '2':
                this.diagnos();
                break;
            case '3':
                this.history();
                break;
            case '4':
                this.bill();
                break;
            case '5':
                this.info();
                break;
            case '6':
                this.exit();
                break;
            default:
                System.out.print("\n\n\t\t\t\t\t\tНевалиден избор\n");
                System.out.print("\t\t\t\t\t\tОпитайте пак...........\n\n");

        }
        pressAnyKeyToContinue();
        this.menu();
    }

    void patient() {
        System.out.print("Въведете име на файла на пациента: ");
        String var1 = this.scan.next();
        this.getCurrentTimeUsingDate();

        try {
            FileWriter var2 = new FileWriter(var1 + ".txt");
            BufferedWriter var3 = new BufferedWriter(var2);
            System.out.print("\n********************************************************************\n");
            var3.write("Дата на постъпване: " + this.dadm);
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

    void diagnos() {
        this.getCurrentTimeUsingDate();
        System.out.print("\n\nВъведете името на файла на пациента за да бъде отворен : ");
        String var7 = this.scan.next();
        String var8 = null;

        try {
            FileReader var9 = new FileReader(var7 + ".txt");
            BufferedReader var10 = new BufferedReader(var9);
            System.out.println("\n\n\n\n\t\t\t\t........................................ Информация за '" + var7 + "' ........................................\n\n\n\n");

            while((var8 = var10.readLine()) != null) {
                System.out.println(var8);
            }

            var10.close();
            PrintWriter var11 = new PrintWriter(new BufferedWriter(new FileWriter(var7 + ".txt", true)));
            System.out.print("Добавете повече информация за пациента................на дата : " + this.dadm);
            var11.println("Дата:" + this.dadm);
            System.out.print("\nНазначен лекар:");
            String var6 = this.readString();
            var11.println("Назначен лекар: " + var6);
            System.out.print("\nСимптоми : ");
            String var1 = this.readString();
            var11.println("Симптоми : " + var1);
            System.out.print("\nДиагноза : ");
            String var2 = this.readString();
            var11.println("Диагноза : " + var2);
            System.out.print("\nЛекарства : ");
            String var3 = this.readString();
            var11.println("Лекарства : " + var3);
            System.out.print("\nНужно ли е да бъде поставен под лекарско наблюдение? : ");
            String var4 = this.readString();
            var11.println("Нужно ли е да бъде поставен под лекарско наблюдение? : " + var4);
            if (!var4.equals("Да") && !var4.equals("да")) {
                var11.println("*************************************************************************\n");
            } else {
                System.out.print("\nТип отделение : ");
                String var5 = this.readString();
                var11.println("Тип отделение : " + var5);
                var11.println("\n*************************************************************************\n");
                System.out.print(var5 + " ward is alloted Successfully\n");
            }

            var11.close();
            this.pressAnyKeyToContinue();
        } catch (FileNotFoundException var12) {
            System.out.println("Unable to open file '" + var7 + "'");
        } catch (IOException var13) {
            System.out.println("Error writing or Reading to file '" + var7 + "'");
        }

    }

    void history() {
        System.out.print("\n\nEnter the patient's file name to be opened : ");
        String var1 = this.scan.next();
        String var2 = null;

        try {
            FileReader var3 = new FileReader(var1 + ".txt");
            BufferedReader var4 = new BufferedReader(var3);
            System.out.print("\n\n\n\n\t\t\t\t........................................ Full Medical History of '" + var1 + "' ........................................\n\n\n\n");

            while((var2 = var4.readLine()) != null) {
                System.out.println(var2);
            }

            this.pressAnyKeyToContinue();
            var4.close();
        } catch (FileNotFoundException var5) {
            System.out.println("Unable to open file '" + var1 + "'");
        } catch (IOException var6) {
            System.out.println("Error reading file '" + var1 + "'");
        }

    }

    void bill() {
        this.getCurrentTimeUsingDate();
        System.out.println("\t\t\t\t\t\t _________________________________________________________________ ");
        System.out.print("\n\n\t\t\t\t\t\t\t\t  E-HEALTH CARE MANAGEMENT SYSTEM \n\n");
        System.out.println("\t\t\t\t\t\t _________________________________________________________________ ");
        System.out.print("Въведете името на файла на пациента за да получите сметката му: ");
        String var8 = this.scan.next();
        String var9 = null;

        try {
            FileReader var10 = new FileReader(var8 + ".txt");
            PrintWriter var11 = new PrintWriter(new BufferedWriter(new FileWriter(var8 + ".txt", true)));
            BufferedReader var12 = new BufferedReader(var10);
            System.out.print("Дата: " + this.dadm);
            System.out.println("\n\n\n\n\t\t\t\tДетайли за пациента:\n\n\n\n");

            while((var9 = var12.readLine()) != null) {
                System.out.println(var9);
            }

            System.out.print("\t\t\t\t\t\t _________________________________________________________________ ");
            System.out.println("\n\t\t\t\t\t\t\t\t\tСметката на пациента:");
            System.out.print("\t\t\t\t\t\t _________________________________________________________________ \n\n");
            System.out.print("\t\t\t\t\t\tКолко дни е престоял:");
            int var1 = this.scan.nextInt();
            System.out.print("\t\t\t\t\t\tWard charges/day:");
            double var2 = this.scan.nextDouble();
            System.out.print("\n\t\t\t\t\t\tTotal ward charges:" + var2 * (double)var1);
            System.out.print("\n\t\t\t\t\t\tDoctor's fee:");
            double var4 = this.scan.nextDouble();
            System.out.print("\n\t\t\t\t\t\tService charges:");
            double var6 = this.scan.nextDouble();
            System.out.print("\n\t\t\t\t\t\tTOTAL AMOUNT:" + (var2 * (double)var1 + var4 + var6));
            var11.println("Total Bill:" + (var2 * (double)var1 + var4 + var6));
            System.out.print("\n\t\t\t\t\t\t _________________________________________________________________ \n");
            var11.close();
            var12.close();
        } catch (FileNotFoundException var13) {
            System.out.println("Unable to open file '" + var8 + "'");
        } catch (IOException var14) {
            System.out.println("Error reading file '" + var8 + "'");
        }

        this.pressAnyKeyToContinue();
    }

    void exit() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\n");
        System.out.print("\t\t\t\t\t _______________________________________________________________________________________ \n");
        System.out.print("\t\t\t\t\t|                                           \t\t                                |\n");
        System.out.print("\t\t\t\t\t|                                           \t\t                                |\n");
        System.out.print("\t\t\t\t\t|                                           \t\t                                |\n");
        System.out.print("\t\t\t\t\t|                                           \t\t                                |\n");
        System.out.print("\t\t\t\t\t|                                           \t\t                                |\n");
        System.out.print("\t\t\t\t\t|                         Благодаря, че използвахте този продукт                        |\n");
        System.out.print("\t\t\t\t\t|                                                                                       |\n");
        System.out.print("\t\t\t\t\t|                            E-HEALTH CARE MANAGEMENT SYSTEM                            |\n");
        System.out.print("\t\t\t\t\t|                                                                                       |\n");
        System.out.print("\t\t\t\t\t|                                                                                       |\n");
        System.out.print("\t\t\t\t\t|                                                                                       |\n");
        System.out.print("\t\t\t\t\t|                                                                                       |\n");
        System.out.print("\t\t\t\t\t|                                                                                       |\n");
        System.out.print("\t\t\t\t\t|                                                                                       |\n");
        System.out.print("\t\t\t\t\t|_______________________________________________________________________________________|\n");
        System.out.print("\t\t\t\t\t\n\n\n\n\t\t\t\t\t");
        System.exit(0);
    }

    void info() {
        System.out.println("\n\nE-Health care management system is command-driven application that helps to manage the record of the patient's as well as generate their hospital bills.");
        System.out.print("\t\t\t\t__________________________________________________________________________________________________________________________________\n");
        System.out.print("\t\t\t\t\tОпции\t\t             | Description\n");
        System.out.print("\t\t\t\t__________________________________________________________________________________________________________________________________\n");
        System.out.println("\t\t\t\t 1 >> Добави нов пациент         | A new patient file can be created by using this module.");
        System.out.println("\t\t\t\t 2 >> Добави диагноза на съществуващ пациент      | Adding day-to-day evaluation of the patient or the diagnosis report in the existing file.");
        System.out.println("\t\t\t\t 3 >> История на пациент         | Check the previous or existing details of particular patient by using their file name.");
        System.out.println("\t\t\t\t 4 >> Сметка на пациент            | Generates the bill of the patient with displaying the details.");
        System.out.println("\t\t\t\t 5 >> Помощ\t\t\t     | Provide the help documentation.");
        System.out.println("\t\t\t\t 6 >> Изход\t\t             | Излиза от програмата.");
        this.pressAnyKeyToContinue();
    }
}

