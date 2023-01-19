package Events;

import static io.restassured.RestAssured.given;

import Events.models.event.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;

public class E2ETest
{
    String response;
    Response fetchCurrenciesResponse;
    Response categoriesResponse;
    GetTicketClasses getTicketClasses = new GetTicketClasses();
    String eventCategoryId;
    String parentEventId;
    String parentEvent;
    Properties prop = new Properties();
    ArrayList<Double> currenciesRate = new ArrayList<Double>();
    List<TicketClass> ticketClassesConfig;
    List<TicketClass> ticketClassesConfigList = new ArrayList<>();
    List<String> supportedCurrencies = new ArrayList(Arrays.asList("AED","AMD","AOA","ARS","AUD","AWG","AZN","BAM","BBD","BDT","BGN","BIF","BMD","BND","BOB","BRL","BSD","BWP","BYN","BZD","CAD","CHF","CLP","CNY","COP","CRC","CVE","CZK","DJF","DKK","DOP","DZD","EGP","ETB","EUR","FJD","FKP","GBP","GEL","GIP","GMD","GNF","GTQ","GYD","HKD","HNL","HRK","HTG","HUF","IDR","ILS","INR","ISK","JMD","JPY","KES","KGS","KHR","KMF","KRW","KYD","KZT","LAK","LBP","LKR","LRD","LSL","MAD","MDL","MKD","MNT","MOP","MUR","MVR","MWK","MXN","MYR","MZN","NAD","NGN","NIO","NOK","NPR","NZD","PAB","PEN","PGK","PHP","PKR","PLN","PYG","QAR","RON","RSD","RUB","RWF","SAR","SBD","SCR","SEK","SGD","SHP","SLL","SOS","SRD","SVC","SYP","SZL","THB","TJS","TOP","TRY","TTD","TWD","TZS","UAH","UGX","USD","UYU","UZS","VES","VND","VUV","WST","XAF","XCD","XOF","XPF","YER","ZAR"));

    @BeforeTest
    public void getData() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\EventsE2E\\src\\main\\java\\Events\\env.properties");
        prop.load(fis);
        RestAssured.baseURI = prop.getProperty("TicketLakeHost");
    }

    @Test(testName = "get-all-parent-categories - Fetch event categories", priority = 0)
    public void getEventCategories(){
        categoriesResponse = given().header("Content-Type", "application/json").
                when().get(resources.parentCategoriesResource()).
                then().statusCode(200).
                extract().response();
        ResponseBody body = categoriesResponse.getBody();
        GetAllParentCategories responseBody = body.as(GetAllParentCategories.class);
        for (int i=0; i< responseBody.getData().size(); i++){
            if(responseBody.getData().get(i).getTitle().equals("Events"))
            {
                eventCategoryId = responseBody.getData().get(i).getId();
            }
        }
    }

    @Test(priority = 1)
    public void SaveParentEventInfo()
    {
        List<String> categories = new ArrayList(Arrays.asList(eventCategoryId));
        List phoneNumber = new ArrayList(Arrays.asList("03465678987"));
        List landLine = new ArrayList(Arrays.asList());
        List customURL = new ArrayList(Arrays.asList());
        List galleryImages = new ArrayList(Arrays.asList());
        List localCurrencies = new ArrayList(Arrays.asList());
        List tags = new ArrayList(Arrays.asList());

        BannerImage34 bannerImage34 = new BannerImage34();
        bannerImage34.getImageKey(null);
        bannerImage34.getImageUrl(null);


        EventsPayload eventsPayload = new EventsPayload();
        BannerImageKey bannerImageKey = new BannerImageKey();
        ContactPersonInfo contactPersonInfo = new ContactPersonInfo();

        eventsPayload.setBannerImage34(bannerImage34);
        eventsPayload.setTitle("Covid Vaccine Certificate");
        eventsPayload.setCurrency("GHS");
        eventsPayload.setCustomSeatingPlan(true);
        eventsPayload.setEventType("STANDARD");
        eventsPayload.setSeatingType("UNSTRUCTURED");
        eventsPayload.setSupportedCurrencies(supportedCurrencies);
        eventsPayload.setOrganizationId("5dc5bc770917d02713574cab");
        eventsPayload.setEventCategories(Collections.singletonList(categories));
        eventsPayload.setDescription("Coronavirus disease (COVID-19) is an infectious disease caused by the SARS-CoV-2 virus." +
                "Most people who fall sick with COVID-19 will experience mild to moderate symptoms and recover without special treatment. However, some will become seriously ill and require medical attention.");
        bannerImageKey.setImageKey("event/f36669ce-5e98-4d7b-9963-98fa8870e3d6/e5a601e5-6f71-4cff-9c44-9dfa816a447a.jpeg"
        );
        bannerImageKey.setImageUrl("https://ticketlakenew-qa.s3.us-east-1.amazonaws.com/event/f36669ce-5e98-4d7b-9963-98fa8870e3d6/e5a601e5-6f71-4cff-9c44-9dfa816a447a.jpeg");
        eventsPayload.setBannerImageKey(bannerImageKey);
        contactPersonInfo.setEmail("automation@gmail.com");
        contactPersonInfo.setPhoneNumber(phoneNumber);
        contactPersonInfo.setLandLine(landLine);
        eventsPayload.setContactPersonInfo(contactPersonInfo);
        eventsPayload.setCustomURLs(customURL);
        eventsPayload.setGalleryImages(galleryImages);
        eventsPayload.setLocalCurrencies(localCurrencies);
        eventsPayload.setImdbUrl("");
        eventsPayload.setTags(tags);

        response = given().log().all().header("Content-Type", "application/json").header("X-Auth", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI1ZDEwOWZmZWVmZTQ1YTBjOTFmYzg4MjkiLCJhY2Nlc3MiOiJhdXRoIiwiZXhwaXJ5IjoiMjAyMi0xMS0yNVQwNjo1Nzo0MyswMDowMCIsIm9yZ2FuaXphdGlvbklkIjoiNWRjNWJjNzcwOTE3ZDAyNzEzNTc0Y2FiIiwib3JnYW5pemF0aW9uTmFtZSI6IlRpY2tldGxha2UiLCJpYXQiOjE2NjQxNzU0NjN9.ykiWpMP3pl5UbsRsJAfDMEJLkEZtrCKc2WT6PhfwUEo").and().
                body(eventsPayload).log().all().
                when().post(resources.parentEventResource()).
                then().assertThat().statusCode(200).
                extract().response().asString();
        JsonPath js = new JsonPath(response).setRootPath("data");
        parentEventId = js.get("_id");
        parentEvent = js.get("parentEvent");
    }

    @Test(testName = "Save Ticket classes", priority = 2)
    public void sveTicketClasses() throws NoSuchFieldException, IllegalAccessException {

        TicketClassesPayload ticketClassesPayload = new TicketClassesPayload();
        ticketClassesPayload.setParentEvent(parentEvent);

        List ticketClassesList = new ArrayList();


        ticketClassesList.add(0, new TicketClassesConfig("VIP", "#008080"));
        ticketClassesList.add(1, new TicketClassesConfig("Economy", "#008080"));
        ticketClassesPayload.setTicketClassesConfig(ticketClassesList);



         String rs = given().header("Content-Type", "application/json").header("X-Auth", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI1ZDEwOWZmZWVmZTQ1YTBjOTFmYzg4MjkiLCJhY2Nlc3MiOiJhdXRoIiwiZXhwaXJ5IjoiMjAyMi0xMS0yNVQwNjo1Nzo0MyswMDowMCIsIm9yZ2FuaXphdGlvbklkIjoiNWRjNWJjNzcwOTE3ZDAyNzEzNTc0Y2FiIiwib3JnYW5pemF0aW9uTmFtZSI6IlRpY2tldGxha2UiLCJpYXQiOjE2NjQxNzU0NjN9.ykiWpMP3pl5UbsRsJAfDMEJLkEZtrCKc2WT6PhfwUEo").and().
                body(ticketClassesPayload).
                when().post(resources.parentEventResource()).then().extract().response().asString();



        JsonPath js = new JsonPath(rs).setRootPath("data");

        ArrayList<LinkedHashMap> ticketClassesArrayList = js.get("ticketClassesConfig");
        Map<String, String> fieldMapping = new HashMap<>();
        fieldMapping.put("_id", "ticketClassId");

        // Manually map all the classes to TicketClass.class
        for (LinkedHashMap map : ticketClassesArrayList) {
            TicketClass ticketClass = new TicketClass();
            for (Object key : map.keySet()) {
                String fieldName = (String) key;
                String mappedFieldName = fieldMapping.getOrDefault(fieldName, fieldName);
//                if (!fieldName.equals("_id")) {
                    Field field = TicketClass.class.getDeclaredField(mappedFieldName);
                    field.setAccessible(true);
                    field.set(ticketClass, map.get(key));
//                }
            }
            ticketClassesConfigList.add(ticketClass);
        }
        System.out.println("something");


//        Boolean cr = getTicketClasses.getData().getIsPublished();
//        System.out.println(cr);
//        System.out.println(getTicketClasses.getData().getTicketClassesConfig().get(0).getTicketClassName());
//        System.out.println(getTicketClasses.getData().getTitle());
//        String st = ticketClassesResponse.asString();
//        JsonPath js = new JsonPath(st).setRootPath("data");
//        ResponseBody bd = js.get("ticketClassesConfig");
//        TicketClass responseBody = bd.as(TicketClass.class);
//        System.out.println(responseBody.getTicketClassId());
//
//
////        ResponseBody body = ticketClassesResponse.getBody();
////        TicketClass responseBody = body.as(TicketClass.class);
//
//        for (int x =0;x <ticketClassesList.size();x++){
//          responseBody.setAvailableTickets(200);
//          responseBody.setBaseCurrencySalePrice(2);
//        }
//        System.out.println("Response body: "+responseBody.getAvailableTickets());
    }

    @Test(testName = "fetch-conversion-rate | Fetch rates of all the currencies", priority = 3)
    public void fetchCurrenciesRates(){
        FetchCurrenciesRatePayload fetchCurrenciesRatePayload = new FetchCurrenciesRatePayload();
        fetchCurrenciesRatePayload.setFrom("GHS");
        fetchCurrenciesRatePayload.setTo(supportedCurrencies);

        fetchCurrenciesResponse = given().log().all().header("Content-Type", "application/json").header("X-Auth", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI1ZDEwOWZmZWVmZTQ1YTBjOTFmYzg4MjkiLCJhY2Nlc3MiOiJhdXRoIiwiZXhwaXJ5IjoiMjAyMi0xMS0yNVQwNjo1Nzo0MyswMDowMCIsIm9yZ2FuaXphdGlvbklkIjoiNWRjNWJjNzcwOTE3ZDAyNzEzNTc0Y2FiIiwib3JnYW5pemF0aW9uTmFtZSI6IlRpY2tldGxha2UiLCJpYXQiOjE2NjQxNzU0NjN9.ykiWpMP3pl5UbsRsJAfDMEJLkEZtrCKc2WT6PhfwUEo").and().
                body(fetchCurrenciesRatePayload).when().
                post(resources.fetchCurrenciesResources()).then().log().all().assertThat().statusCode(200).
                extract().response();
        ResponseBody body = fetchCurrenciesResponse.getBody();
        FetchCurrenciesRatePayload responseBody = body.as(FetchCurrenciesRatePayload.class);
        int size = responseBody.getRates().size();
        System.out.println("Size of list: " +size);
        for (int j = 0; j < size; j++){
            currenciesRate.add(responseBody.getRates().get(j).getRate());
        }
        System.out.println(currenciesRate);
    }

    @Test(testName = "fetch-conversion-rate | Fetch rates of all the currencies", priority = 4)
    public void fetchCurrenciesRatess(){
        FetchCurrenciesRatePayload fetchCurrenciesRatePayload = new FetchCurrenciesRatePayload();
        fetchCurrenciesRatePayload.setFrom("GHS");
        fetchCurrenciesRatePayload.setTo(supportedCurrencies);

        GetCurrenciesRate getCurrenciesRate = given().header("Content-Type", "application/json").header("X-Auth", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI1ZDEwOWZmZWVmZTQ1YTBjOTFmYzg4MjkiLCJhY2Nlc3MiOiJhdXRoIiwiZXhwaXJ5IjoiMjAyMi0xMS0yNVQwNjo1Nzo0MyswMDowMCIsIm9yZ2FuaXphdGlvbklkIjoiNWRjNWJjNzcwOTE3ZDAyNzEzNTc0Y2FiIiwib3JnYW5pemF0aW9uTmFtZSI6IlRpY2tldGxha2UiLCJpYXQiOjE2NjQxNzU0NjN9.ykiWpMP3pl5UbsRsJAfDMEJLkEZtrCKc2WT6PhfwUEo").and().
                body(fetchCurrenciesRatePayload).when().
                post(resources.fetchCurrenciesResources()).as(GetCurrenciesRate.class);

        System.out.println(getCurrenciesRate.getRates().get(1).getRate());

    }

    @Test(testName = "manage-event-slot | Save slot data", priority = 5)
    public void saveSlotData(){
        SaveSlotDataPayload saveSlotDataPayload = new SaveSlotDataPayload();
        EventDateTimeSlot eventDateTimeSlot = new EventDateTimeSlot();
        eventDateTimeSlot.setEventStartTime("2023-03-17T15:00:00.000Z");
        eventDateTimeSlot.setEventEndTime("2023-03-18T18:00:00.000Z");
        saveSlotDataPayload.setEventDateTimeSlot(eventDateTimeSlot);

        EventEntryTime eventEntryTime = new EventEntryTime();
        eventEntryTime.setEntryStartTime("2023-03-17T14:00:00.000Z");
        eventEntryTime.setEntryEndTime("2023-03-18T17:00:00.000Z");
        saveSlotDataPayload.setEventEntryTime(eventEntryTime);

        saveSlotDataPayload.setVenueId("633bea780add5300134b930f");

        BannerImageKey bannerImageKey = new BannerImageKey();
        bannerImageKey.setImageKey("event/f36669ce-5e98-4d7b-9963-98fa8870e3d6/6ee20e09-568b-4c4f-b2cd-cc2e80c84685.jpeg");
        bannerImageKey.setImageUrl("https://ticketlake-qa.s3.us-east-2.amazonaws.com/event/f36669ce-5e98-4d7b-9963-98fa8870e3d6/6ee20e09-568b-4c4f-b2cd-cc2e80c84685.jpeg");
        saveSlotDataPayload.setBannerImageKey(bannerImageKey);

        saveSlotDataPayload.setIsPublished(true);


//      ArrayList<TicketClassesConfig> ticketClassArrayList= new ArrayList<>();
//      getTicketClasses.getData().getTicketClassesConfig().get(1).getTicketClassName();
//      ArrayList ar = (ArrayList) getTicketClasses.getData().getTicketClassesConfig();
//        System.out.println(ar.size());
//        getTicketClasses.getData().getTicketClassesConfig().get(0).setAvailableTickets("123");
//        getTicketClasses.getData().getTicketClassesConfig().get(1).setAvailableTickets("235");


        ArrayList<PriceInfo> priceInfoArrayList= new ArrayList<>();
        for (int j=0; j<supportedCurrencies.size();j++){
            PriceInfo priceInfo=new PriceInfo();
            priceInfo.setCurrency(supportedCurrencies.get(j));
            priceInfo.setSalePrice(currenciesRate.get(j) * 3);
            priceInfo.setIndex(j);

            priceInfoArrayList.add(priceInfo);
        }

        ticketClassesConfigList.get(0).setAvailableTickets(200);
        ticketClassesConfigList.get(0).setBaseCurrencySalePrice(3);
        ticketClassesConfigList.get(0).setPriceInfo(priceInfoArrayList);

        ticketClassesConfigList.get(1).setAvailableTickets(300);
        ticketClassesConfigList.get(1).setBaseCurrencySalePrice(5);
        ticketClassesConfigList.get(1).setPriceInfo(priceInfoArrayList);

        saveSlotDataPayload.setTicketClasses(ticketClassesConfigList);

        saveSlotDataPayload.setAvailableSeats(2000);
        saveSlotDataPayload.setSeatingPlan("CUSTOM");
        saveSlotDataPayload.setSeatingType("UNSTRUCTURED");
        saveSlotDataPayload.setIsFeatured(true);
        saveSlotDataPayload.setSlotSaved(false);
        saveSlotDataPayload.setParentEventId(parentEventId);
        saveSlotDataPayload.setIsTicketsPictureProtected(false);


        System.out.println("payload set");

        given().header("Content-Type", "application/json").header("X-Auth", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI1ZDEwOWZmZWVmZTQ1YTBjOTFmYzg4MjkiLCJhY2Nlc3MiOiJhdXRoIiwiZXhwaXJ5IjoiMjAyMi0xMS0yNVQwNjo1Nzo0MyswMDowMCIsIm9yZ2FuaXphdGlvbklkIjoiNWRjNWJjNzcwOTE3ZDAyNzEzNTc0Y2FiIiwib3JnYW5pemF0aW9uTmFtZSI6IlRpY2tldGxha2UiLCJpYXQiOjE2NjQxNzU0NjN9.ykiWpMP3pl5UbsRsJAfDMEJLkEZtrCKc2WT6PhfwUEo").and().
                body(saveSlotDataPayload).when().log().all().
                post(resources.fetchManageEventSlotResources()).then().assertThat().statusCode(200);
    }
}
