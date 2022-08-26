package Module_1.Homework3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Homework3 {

    public static void main(String[] args) throws IOException {
        //Базовый уровень
        //Задача №1
        //Дано: у нас есть две модели машин - жигули и toyota. Каждая из этих машин умеет: начинать движение,
        //останавливаться, включать фары. У жигули есть особенность: она ломается. У Toyota особенность: включает музыку
        //Необходимо:
        // 1.Создать абстрактный класс, который будет описывать общие действия этих машин (методы будут не абстрактные)
        // 2.Создать два класса, которые будут наследоваться от абстрактного класса, и реализовывать особенности этих машин
        // Методы должны просто печатать на экран действия машин (начал движение, включил музыку и тд.)
        // 3. Создать два экземпляра этих классов, и вызвать методы характерные для них

        Toyota toyota = new Toyota();
        toyota.StartMovement();
        toyota.UseHeadlights();
        toyota.TurnMusic();
        toyota.StartBraking();

        Zhiguli zhiguli = new Zhiguli();
        zhiguli.StartMovement();
        zhiguli.UseHeadlights();
        zhiguli.BreakDown();
        zhiguli.StartBraking();
        System.out.println();

        //Задача №2
        //Необходимо:
        // 1. Создать файл "my_first_file.txt". На первой строке написать: "Моя бабушка", на второй: "читает газету жизнь"
        // 2. Прочитать файл, и вывести на экран все слова файла в одну строку
        // Ожидаемый результат: "Моя бабушка читает газету жизнь"

        String textFilePath = System.getProperty("user.dir") + "\\src\\Module_1.Homework3\\my_first_file.txt";
        FileWriter fileWriter = new FileWriter(textFilePath);
        fileWriter.write("Моя бабушка\n");
        fileWriter.write("читает газету жизнь");
        fileWriter.close();

        FileReader fileReader = new FileReader(textFilePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {
            System.out.print(bufferedReader.readLine() + " ");
        }
        System.out.println();
        //Задача №3
        //Необходимо:
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать объект этого класса прямо здесь (class Module_1.Homework3.Module_1.Homework3, метод main), с доходами 500, расходами 300
        // 4. Записать в файл "report.txt" данные из объекта класса.
        // Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы = 300

        FinancialRecord financialRecord = new FinancialRecord(500, 300);

        String financialRecordFilePath = System.getProperty("user.dir") + "\\src\\Module_1.Homework3\\report1.txt";
        FileWriter financialRecordWriter = new FileWriter(financialRecordFilePath);
        financialRecordWriter.write("доходы = " + financialRecord.incomes + ", ");
        financialRecordWriter.write("расходы = " + financialRecord.outcomes);
        financialRecordWriter.close();
        System.out.println("\n");
        //Продвинутый уровень
        //Задача №1
        // Сделать задачу №1 (1 и 2 пункты) из базовой.
        // 1. Создать класс CarFactory, у которого есть два статических метода: создать жигули, создать toyota.
        // 2. Создать 20 тойот, 20 жигулей с помощью CarFactory, положить их в один массив.
        // 3. Пройтись по массиву, проверить к какому классу принадлежит машина, привести тип к классу машины
        // и вызвать характерные для нее методы.
        Car[] carArray = new Car[40];
        for (int i = 0; i < 20; i++) {
            carArray[i] = CarFactory.createToyota();
            carArray[i+20] = CarFactory.createZhiguli();
        }

        for (int i = 0; i < 40; i++) {

            Car car = carArray[i];

            if (car instanceof Toyota) {
                Toyota toyotaCar = (Toyota) car;
                toyotaCar.TurnMusic();
            } else if (car instanceof Zhiguli) {
                Zhiguli zhiguliCar = (Zhiguli) car;
                zhiguliCar.BreakDown();
            }
        }
        System.out.println();
        //Random random = new Random(1);
        //random.nextInt(10000);
        //Задача №2
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать 10 отчетов, с разными доходами и расходами (используй random)
        // 4. Записать в файл "report.txt" все данные из отчетов.
        // 5. Прочитать файл report.txt, просуммировать все доходы и вывести на экран, тоже самое с расходами
        // Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)

        financialRecordFilePath = System.getProperty("user.dir") + "\\src\\Module_1.Homework3\\report2.txt";
        financialRecordWriter = new FileWriter(financialRecordFilePath);
        Random random = new Random();

        for (int i = 1; i < 11; i++) {

            financialRecord = new FinancialRecord(random.nextInt(10000), random.nextInt(10000));

            financialRecordWriter.write("доходы = " + financialRecord.incomes + ", ");
            financialRecordWriter.write("расходы = " + financialRecord.outcomes + "\n");
        }
        financialRecordWriter.close();

        int totalIncomes = 0;
        int totalOutcomes = 0;

        fileReader = new FileReader(financialRecordFilePath);
        bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {

            String[] data = bufferedReader.readLine().split(",");

            totalIncomes += Integer.parseInt(data[0].replaceAll("доходы = ", ""));
            totalOutcomes += Integer.parseInt(data[1].replaceAll(" расходы = ", ""));
        }
        System.out.println("общие доходы - " + totalIncomes + ", общие расходы - " + totalOutcomes);
        System.out.println();
        //Экспертный уровень
        // Дано: папка, внутри которой находятся файлы, следующего именования - report_01_2012.txt, где 01 - месяц, 2012 - год
        // Внутри файла следующий формат:
        // pyterochka;122300.20;100312.10;20/01/2012
        // pyterochka;299922.00;323333.02;21/01/2012
        // perekrestok;9920.20;28200.01;21/01/2012
        // Где pyterochka - название магазина; 122300.20 - доход; 100312.10 - расход, 20/01/2012 - дата операции

        // Читать файлы нужно через
        // Прочитать все файлы из папки
        // String path1 = "путь до файла";
        // Files.walk(Path.of(path1)).forEach(e -> System.out.println(e.toString()));

        // Задача №1
        // Необходимо составить отчет о итоговой прибыли за каждый месяц по магазину pyterochka
        // Формат ожидаемого результат:
        // Прибыль по магазину pyterochka по месяцам
        // 01.2012: 20000.00
        // 02.2012: -100332.00
        // и тд

        HashMap<String, HashMap<String, HashMap<String, Double>>> reports = new HashMap<>();

        String filesPath = System.getProperty("user.dir") + "\\src\\Module_1.Homework3\\";

        Files.walk(Path.of(filesPath)).forEach(path -> {

            String fileName = String.valueOf(path.getFileName());
            if (fileName.matches("^report_+\\d{2}_\\d{4}.txt$")) {

                String monthOfFile = fileName
                        .replaceAll("report_", "")
                        .replaceAll(".txt", "")
                        .replaceAll("_", ".");

                FileReader _fileReader;
                try {
                    _fileReader = new FileReader(filesPath + "\\" + fileName);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }

                BufferedReader _bufferedReader = new BufferedReader(_fileReader);

                while (true) {
                    try {
                        if (!_bufferedReader.ready()) break;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                    String strLine;
                    try {
                        strLine = _bufferedReader.readLine();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                    if (strLine.matches("^.+;\\d+[.]\\d+;\\d+[.]\\d+;\\d{2}/\\d{2}/\\d{4}$")) {

                        String[] strLineData = strLine.split(";");

                        String name = strLineData[0];
                        double incomes = Double.parseDouble(strLineData[1]);
                        double outcomes = Double.parseDouble(strLineData[2]);

                        HashMap<String, HashMap<String, Double>> monthsData = reports.get(name);
                        HashMap<String, Double> monthData;

                        if (monthsData != null) {

                            monthData = monthsData.get(monthOfFile);
                            if (monthData != null) {
                                incomes += monthData.get("incomes");
                                outcomes += monthData.get("outcomes");
                            } else {
                                monthData = new HashMap<>();
                            }
                        } else {
                            monthData = new HashMap<>();
                            monthsData = new HashMap<>();
                        }

                        monthData.put("incomes", incomes);
                        monthData.put("outcomes", outcomes);

                        monthsData.put(monthOfFile, monthData);

                        reports.put(name, monthsData);
                    }
                }
            }
        });

        HashMap<String, HashMap<String, Double>> totaReports = new HashMap<>();

        String filter = "pyterochka";
        reports.forEach((name, monthsData) -> {

            final double[] _totalIncomes = {0};
            final double[] _totalOutcomes = {0};

            if (name.equals(filter)) {
                System.out.println("Прибыль по магазину " + name + " по месяцам:");
            }

            monthsData.forEach((month, data) -> {
                double incomes = data.get("incomes");
                _totalIncomes[0] += incomes;
                if (name.equals(filter)) {
                    System.out.println(month + ": " + incomes);
                }
            });

            if (name.equals(filter)) {
                System.out.println("Расходы по магазину " + name + " по месяцам:");
            }

            monthsData.forEach((month, data) -> {
                double outcomes = data.get("outcomes");
                _totalOutcomes[0] += outcomes;
                if (name.equals(filter)) {
                    System.out.println(month + ": " + outcomes);
                }
            });

            HashMap<String, Double> totalData = new HashMap<>();
            totalData.put("incomes", _totalIncomes[0]);
            totalData.put("outcomes", _totalOutcomes[0]);

            totaReports.put(name, totalData);
        });
        System.out.println();

        // Задача №2
        // Необходим составить отчет о расходах за весь период по магазинам (т.е. прочитать все файлы внутри папки)
        // Формат ожидаемого результата:
        // Расходы pyterochka за весь период: 20032220.00
        // Расходы perekrestok за весь период: 1734220.00
        // .. и тд
        totaReports.forEach((name, totalData) -> {
            if (name.equals(filter)) {
                System.out.println("Прибыль по магазину " + name + " за весь период:" + totalData.get("incomes"));
                System.out.println("Расходы по магазину " + name + " за весь период:" + totalData.get("outcomes"));
            }
        });
    }
}
