package com.bcnc.priceApplicator.application.services;

import com.bcnc.priceApplicator.domain.models.Price;
import com.bcnc.priceApplicator.application.dtos.CriteriaRequestDto;
import org.springframework.stereotype.Service;

@Service
public interface PriceApplicatorService {
    public Price findRateToApply(CriteriaRequestDto filter);
}
