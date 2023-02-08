public class City {
    String name;
    long populasia;
    private double area;
     private  String language;
     private  String major;
    private String[] districs={"Alai","Aravan","Anar","Vostok"};


    public City(String name,long populasia,double area,String language,String major,String [] districs){
this.name=name;
this.populasia=populasia;
this.area=area;
this.language=language;
this.major=major;
this.districs=districs;
    }

    public City(String name, long populasia, double area, String language, String major) {
        this.name = name;
        this.populasia = populasia;
        this.area = area;
        this.language = language;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulasia() {
        return populasia;
    }

    public void setPopulasia(long populasia) {
        this.populasia = populasia;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String[] getDistrics() {
        return districs;
    }

    public void setDistrics(String[] districs) {
        this.districs = districs;
    }
}
