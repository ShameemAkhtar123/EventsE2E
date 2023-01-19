package Events;

public class resources {

    public static String parentCategoriesResource(){
        String res = "api/v2/categories/get-all-parent-categories";
        return res;
    }


    public static String parentEventResource(){
        String res = "/api/v2/events/manage-parent-event";
        return res;
    }

    public static String fetchCurrenciesResources(){
        String res = "/api/v2/currency/fetch-conversion-rates";
        return res;
    }

    public static String fetchManageEventSlotResources(){
        String res = "/api/v2/slots/manage-event-slot";
        return res;
    }


//        Before parent:
//        https://api.qa.ticketlake.com/api/v2/categories/get-all-categories
//        https://api.qa.ticketlake.com/api/v1/events/image-upload
//        parent saving:
//        https://api.qa.ticketlake.com/api/v2/events/manage-parent-event
//        Classes:
//        https://api.qa.ticketlake.com/api/v2/events/manage-parent-event
//        Before slot:
//        https://api.qa.ticketlake.com/api/v1/venues/get-all-venues
//        https://api.qa.ticketlake.com/api/v2/currency/fetch-conversion-rates
//        Slot saving:
//        https://api.qa.ticketlake.com/api/v2/slots/manage-event-slot
//        get events:
//        https://api.qa.ticketlake.com/api/v1/events/fetch-parent-events-for-admins


}
