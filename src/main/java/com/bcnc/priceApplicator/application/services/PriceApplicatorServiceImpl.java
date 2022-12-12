package com.bcnc.priceApplicator.application.services;

import com.bcnc.priceApplicator.application.dtos.CriteriaRequestDto;
import com.bcnc.priceApplicator.application.repositories.PriceRepository;
import com.bcnc.priceApplicator.domain.exceptions.PriceNotFoundException;
import com.bcnc.priceApplicator.domain.models.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PriceApplicatorServiceImpl implements PriceApplicatorService {

    @Autowired
    PriceRepository priceRepository;

    @Override
    public Price findRateToApply(CriteriaRequestDto filter) {
        Price price = priceRepository.findRateToApply(filter).orElseThrow(() -> new PriceNotFoundException("Price not Found"));
        price.setApplicationDate(filter.getApplicationDate());
        return price;
    }

}
