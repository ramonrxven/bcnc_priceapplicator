package com.bcnc.priceApplicator.infrastructure.outputAdapter;

import com.bcnc.priceApplicator.domain.models.Price;
import com.bcnc.priceApplicator.infrastructure.outputPort.PriceEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PricePersistenseMapper {

    Price toPrice(PriceEntity priceEntity);
    Iterable<Price> toPrices(Iterable<Price> pricesEntities);
}

