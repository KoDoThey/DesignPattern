package structional.facade;

public class ShopFacade {
    private AccountService accountService;
    private MailService mailService;
    private PaymentService paymentService;
    private ShippingService shippingService;

    private ShopFacade() {
        accountService = new AccountService();
        mailService = new MailService();
        paymentService = new PaymentService();
        shippingService = new ShippingService();
    }

    public static ShopFacade getInstance() {
        return ShopFacadeHelper.INSTANCE;
    }

    public static class ShopFacadeHelper {
        private static final ShopFacade INSTANCE = new ShopFacade();
    }

    public void buyByCashFreeShipping(String email){
        accountService.getAccount(email);
        mailService.mail(email);
        paymentService.paymentCash();
        shippingService.freeShipping();
    }

    public void buyByBankingStandardShipping(String email){
        accountService.getAccount(email);
        paymentService.paymentEbanking();
        shippingService.standardShipping();
        mailService.mail(email);
    }
}