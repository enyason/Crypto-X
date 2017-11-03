package com.example.android.crypto_x;

/**
 * Created by Enyason on 10/14/2017.
 */


//model class for currency data
public class CryptoX {

    String coinType;


    public CryptoX(String coinType) {
        this.coinType = coinType;

    }

    public String getCoinType() {
        return coinType;
    }
}
