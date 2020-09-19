package com.vendingmachine.vendingmachine.config;

import com.vendingmachine.vendingmachine.converter.CreateItemDtoToItemEntityConverter;
import com.vendingmachine.vendingmachine.converter.ExtendedConversionService;
import com.vendingmachine.vendingmachine.converter.ItemEntityConverterToCreateItemResponseDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;

@Configuration
public class ConversionConfig {

    @Bean
    public ConversionService conversionService() {
        ExtendedConversionService conversionService = new ExtendedConversionService();

        conversionService.addConverter(new CreateItemDtoToItemEntityConverter());
        conversionService.addConverter(new ItemEntityConverterToCreateItemResponseDto());

        return conversionService;
    }

}
