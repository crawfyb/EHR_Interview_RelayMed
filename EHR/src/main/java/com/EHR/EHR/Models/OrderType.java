package com.EHR.EHR.Models;

public class OrderType {

        private int orderCode;

        private String orderName;

        private String specimenType;

        public OrderType(int orderCode, String orderName, String specimenType) {
            this.orderCode = orderCode;
            this.orderName = orderName;
            this.specimenType = specimenType;
        }

    public OrderType() {
    }

    public int getOrderCode() {
            return orderCode;
        }

        public void setOrderCode(int orderCode) {
            this.orderCode = orderCode;
        }

        public String getOrderName() {
            return orderName;
        }

        public void setOrderName(String orderName) {
            this.orderName = orderName;
        }

        public String getSpecimenType() {
            return specimenType;
        }

        public void setSpecimenType(String specimenType) {
            this.specimenType = specimenType;
        }

    }
