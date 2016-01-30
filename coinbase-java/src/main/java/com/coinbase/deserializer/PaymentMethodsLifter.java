package com.coinbase.deserializer;

import com.coinbase.entity.PaymentMethod;
import com.coinbase.entity.PaymentMethodNode;
import com.fasterxml.jackson.databind.util.StdConverter;

import java.util.ArrayList;
import java.util.List;

public class PaymentMethodsLifter extends StdConverter<List<PaymentMethodNode>, List<PaymentMethod>> {

    public List<PaymentMethod> convert(List<PaymentMethodNode> nodes) {
	ArrayList<PaymentMethod> result = new ArrayList<PaymentMethod>();
	
	for (PaymentMethodNode node : nodes) {
	    result.add(node.getPaymentMethod());
	}
	
	return result;
    }

}
