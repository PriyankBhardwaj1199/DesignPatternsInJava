import com.DesignPattern.Behavioral.Observer.*;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        NewsChannel newsChannel = new NewsChannel();
        NewsWebsite newsWebsite = new NewsWebsite();
        NewsApp mobileApp = new NewsApp();

        newsAgency.registerObserver(newsChannel);
        newsAgency.registerObserver(newsWebsite);
        newsAgency.registerObserver(mobileApp);

        newsAgency.setNews("New Java version released!");
        newsAgency.setNews("New Observer Design Pattern tutorial available!");
    }
}
