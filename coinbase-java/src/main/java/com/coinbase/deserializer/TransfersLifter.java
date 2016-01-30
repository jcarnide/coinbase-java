package com.coinbase.deserializer;

import com.coinbase.entity.Transfer;
import com.coinbase.entity.TransferNode;
import com.fasterxml.jackson.databind.util.StdConverter;

import java.util.ArrayList;
import java.util.List;

public class TransfersLifter extends StdConverter<List<TransferNode>, List<Transfer>> {

    public List<Transfer> convert(List<TransferNode> nodes) {
	ArrayList<Transfer> result = new ArrayList<Transfer>();
	
	for (TransferNode node : nodes) {
	    result.add(node.getTransfer());
	}
	
	return result;
    }

}
