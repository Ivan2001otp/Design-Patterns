package model.parking;

import model.payment.PaymentStatus;
import model.payment.PaymentType;
import utils.Utility;

public class ParkingExpense {
    private final String paymentId;
    private final ParkingType parkingType;
    private  PaymentStatus paymentStatus;
    private final double durationInHrs;
    private final float amount;
    private final String driverId;

    private final PaymentType paymentType;


    public ParkingExpense(ParkingType parkingType, double durationInHrs, float amount, String driverId, PaymentType paymentType) {
        this.paymentId = Utility.autoGenerateId();
        this.paymentStatus = PaymentStatus.PENDING;
        this.amount = amount;
        this.driverId = driverId;
        this.parkingType = parkingType;
        this.durationInHrs = durationInHrs;
        this.paymentType = paymentType;
    }


    public void changePaymentStatus(PaymentStatus status) {
        paymentStatus = status;
    }

    public String getDriverId(){return driverId;}
    public float getAmount(){return amount;}
    public PaymentStatus getPaymentStatus(){return paymentStatus;}
    public double getDurationInHrs(){return durationInHrs;}
    public ParkingType getParkingType() {return parkingType;}
    public PaymentType getPaymentType(){return paymentType;}


}
