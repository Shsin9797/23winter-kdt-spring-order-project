package org.prgrms.kdt;

import org.springframework.util.Assert;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OrderTester {
    public static void main(String[] args) {
        var customerId = UUID.randomUUID();
        var orderItems = new ArrayList<OrderItem>(){{
           add(new OrderItem(UUID.randomUUID(),100L,1));
        }};

        var fixedAmountVoucher = new FixedAmountVoucher(UUID.randomUUID(),10L);

        var order = new Order(UUID.randomUUID(),customerId,orderItems,fixedAmountVoucher); // 금액이 아니라 바우처를 전달받게 해야함
                                                                                    // 이때 fixed 인지 percent 인지.. 실행시점에서 결정하는거임.. 이안에 넣는게 뭔지에따라 달라짐


        Assert.isTrue(order.totalAmount()== 90L, MessageFormat.format("totalAmount {0} is not 90L", order.totalAmount()));
    }
}
