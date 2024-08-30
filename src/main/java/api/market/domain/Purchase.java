package api.market.domain;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Purchase {
    private int purchaseId;

    private  String CustomerId;

    private LocalDateTime date;

    private  char paymetPurchase;

    private String comment;

    private int active;

    private List<Purchase> items;

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String customerId) {
        CustomerId = customerId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public char getPaymetPurchase() {
        return paymetPurchase;
    }

    public void setPaymetPurchase(char paymetPurchase) {
        this.paymetPurchase = paymetPurchase;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public List<Purchase> getItems() {
        return items;
    }

    public void setItems(List<Purchase> items) {
        this.items = items;
    }
}
