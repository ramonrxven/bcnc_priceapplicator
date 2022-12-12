package com.bcnc.priceApplicator.application.repositories;

import com.bcnc.priceApplicator.domain.models.Price;
import com.bcnc.priceApplicator.application.dtos.CriteriaRequestDto;

import java.util.Optional;

public interface PriceRepository {
    public Optional<Price> findRateToApply(CriteriaRequestDto filter);
}
