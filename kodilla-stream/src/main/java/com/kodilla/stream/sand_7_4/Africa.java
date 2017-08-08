package com.kodilla.stream.sand_7_4;

import java.math.BigDecimal;

public final class Africa implements SandStorage {
    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("99999999901234567890");
        return sandQuantity;
    }
}