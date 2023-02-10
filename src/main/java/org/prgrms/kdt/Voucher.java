package org.prgrms.kdt;

import java.util.UUID;

public interface Voucher {
    UUID getVoucherId(); //모든엔터티는 id 가 있어야해서.. id 가져오는 행위 추가 (메소드, 동작)
    long discount(long beforeDiscount); // 이걸 상속받는 애들은 할인 함수 .. 를 강제로 구현하게 하겠다. . .
}
