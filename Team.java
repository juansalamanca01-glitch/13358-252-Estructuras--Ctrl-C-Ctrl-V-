public class Team {


    private String name;
    private int stars;
    private int intlParticipations;
    private int intlFinals;
    private int localFinals;
    private long fans;
    private double marketValue;
    private double payroll;


    public Team() {}

    public Team(String name, int stars, int intlParticipations,
                int intlFinals, int localFinals, long fans,
                double marketValue, double payroll) {
        this.name = name;
        this.stars = stars;
        this.intlParticipations = intlParticipations;
        this.intlFinals = intlFinals;
        this.localFinals = localFinals;
        this.fans = fans;
        this.marketValue = marketValue;
        this.payroll = payroll;
    }

  
    public static final void printer(Team[] teams) {
        String header = String.format(
                "%-22s %6s %6s %8s %9s %12s %14s %12s",
                "Team", "Stars", "Intl", "IntlFin", "LocalFin", "Fans", "MarketValue", "Payroll"
        );
        String sep = "-".repeat(header.length());
        System.out.println(header);
        System.out.println(sep);

        for (Team t : teams) {
            String fansStr = java.text.NumberFormat
                    .getInstance(java.util.Locale.US)
                    .format(t.fans); // 1,234,567
            System.out.printf("%-22s %6d %6d %8d %9d %12s %14s %12s%n",
                    t.name,
                    t.stars,
                    t.intlParticipations,
                    t.intlFinals,
                    t.localFinals,
                    fansStr,
                    String.format("%.2fM", t.marketValue),
                    String.format("%.2fM", t.payroll)
            );
        }
        System.out.println(sep);
    }

    
    public static final void sortByStars(Team[] teams) {
        int n = teams.length;
        for (int i = 1; i < n; i++) {
            Team key = teams[i];
            int j = i - 1;
            while (j >= 0 && teams[j].stars < key.stars) { // mayor a menor
                teams[j + 1] = teams[j];
                j--;
            }
            teams[j + 1] = key;
        }
    }

    public static final void sortByIntlParticipations(Team[] teams) {
        int n = teams.length;
        for (int i = 1; i < n; i++) {
            Team key = teams[i];
            int j = i - 1;
            while (j >= 0 && teams[j].intlParticipations < key.intlParticipations) {
                teams[j + 1] = teams[j];
                j--;
            }
            teams[j + 1] = key;
        }
    }

    public static final void sortByFans(Team[] teams) {
        int n = teams.length;
        for (int i = 1; i < n; i++) {
            Team key = teams[i];
            int j = i - 1;
            while (j >= 0 && teams[j].fans < key.fans) {
                teams[j + 1] = teams[j];
                j--;
            }
            teams[j + 1] = key;
        }
    }

  
    public static final void sortByMarketValue(Team[] teams) {
        int n = teams.length;
        for (int i = 1; i < n; i++) {
            Team key = teams[i];
            int j = i - 1;
            while (j >= 0 && teams[j].marketValue < key.marketValue) {
                teams[j + 1] = teams[j];
                j--;
            }
            teams[j + 1] = key;
        }
    }


    public static final void sortByPayroll(Team[] teams) {
        int n = teams.length;
        for (int i = 1; i < n; i++) {
            Team key = teams[i];
            int j = i - 1;
            while (j >= 0 && teams[j].payroll < key.payroll) {
                teams[j + 1] = teams[j];
                j--;
            }
            teams[j + 1] = key;
        }
    }

  
    public static void main(String[] args) {
        // Crear equipos
        Team t1 = new Team("Once Caldas",         4, 3, 3,  6, 1_800_000L, 11.5,  4.5);
        Team t2 = new Team("Atlético Nacional",  18, 7, 13, 30, 11_591_000L, 25.3, 12.0);
        Team t3 = new Team("Millonarios",        16, 4, 2, 26, 8_996_000L, 15.8, 10.0);
        Team t4 = new Team("América de Cali",    8, 5, 6, 15, 4_200_000L, 9.7,  5.8);

        Team[] teams = {t1, t2, t3, t4};

        System.out.println("EQUIPO ORIGINAL");
        printer(teams);

      
        Team[] copia = teams.clone();
        sortByStars(copia);
        System.out.println("\n ORDENADO POR ESTRELLAS (Mayor → Menor)");
        printer(copia);

      
        copia = teams.clone();
        sortByIntlParticipations(copia);
        System.out.println("\nORDENADO POR PARTICIPACIÓN INTERNACIONAL");
        printer(copia);

        copia = teams.clone();
        sortByFans(copia);
        System.out.println("\n ORDENADO POR CANTIDAD DE FANS");
        printer(copia);

   
        copia = teams.clone();
        sortByMarketValue(copia);
        System.out.println("\nORDENADO POR VALOR DE MERCADO");
        printer(copia);

        copia = teams.clone();
        sortByPayroll(copia);
        System.out.println("\n ORDENADO POR NÓMINA (Payroll)");
        printer(copia);
    }
}