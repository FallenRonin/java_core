package ru.mentee.power;

public class CurrencyConverter {
    public static void main(String[] args) {
        final double usdExchangeRate = 80.85;
        final double eurExchangeRate = 93.92;
        final double cnyExchangeRate = 11.28;

        double usdValue = 1000;
        double eurValue = 800;
        double cnyValue = 150.3;

        System.out.println("Курсы валют:");
        System.out.printf("1 USD = %f RUB\n", usdExchangeRate);
        System.out.printf("1 EUR = %f RUB\n", eurExchangeRate);
        System.out.printf("1 CNY = %f RUB\n", cnyExchangeRate);
        System.out.print("\n");
        System.out.println("Конвертация:");
        System.out.printf("%f USD = %f RUB\n", usdValue, usdExchangeRate * usdValue);
        System.out.printf("%f EUR = %f RUB\n", usdValue, eurExchangeRate * eurValue);
        System.out.printf("%f CNY = %f RUB\n", usdValue, cnyExchangeRate * cnyValue);
        System.out.println("Демонстрация проблемы точности с double:");

        System.out.printf("0.3 + 0.4 == %.10f", 0.3f + 0.4f);
        System.out.printf("(0.1 + 0.2) == 0.3 ? %b", 0.1 + 0.2 == 0.3);
    }
}
