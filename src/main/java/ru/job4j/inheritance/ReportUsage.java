package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String name = "Report's name";
        String body = "Report's body";
        String text = report.generate(name, body);
        JSONReport jsonReport = new JSONReport();
        String json = jsonReport.generate(name, body);
        HtmlReport htmlReport = new HtmlReport();
        String html = htmlReport.generate(name, body);
        System.out.println(text);
        System.out.println(json);
        System.out.println(html);
    }
}