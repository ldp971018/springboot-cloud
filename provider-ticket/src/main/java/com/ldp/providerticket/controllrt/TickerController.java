package com.ldp.providerticket.controllrt;

import com.ldp.providerticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Return
 * @create 2019-05-29 16:42
 */
@RestController
public class TickerController {
    @Autowired
    private TicketService ticketService;

    @GetMapping("/ticket")
    public String ticket(){
        return ticketService.getTicket();
    }
}
