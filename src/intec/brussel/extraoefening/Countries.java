package intec.brussel.extraoefening;

public enum Countries {
    BELGIE(1),
    RUSSIA(2),
    KAZAKHSTAN(3),
    CHINA(4),
    SOUTHKOREA(5),
    USA(6),
    SPAIN(7),
    FRANCE(8),
    GERMANY(9),
    ITALY(10),
    SWEDEN(11);

    private Countries defaultName;
    private int countryName;

    Countries(int countryName) {
        this.countryName = countryName;
        //System.out.println("Constructor is called " + this.toString());
    }

    public void defaultCountry() {
        System.out.println("The default country is " + BELGIE);
    }

    public int getCountryName() {
        return countryName;
    }
}

