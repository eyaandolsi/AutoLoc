
package tn.esprit.autoloc.autoloc_api.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autoloc_api.domain.Reservation;
import tn.esprit.autoloc.autoloc_api.service.IReservationService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {

    final IReservationService reservationService;

    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation r) {
        return reservationService.addReservation(r);
    }

    @GetMapping("/getReservations")
    public List<Reservation> getAllReservations() {
        return reservationService.retrieveAllReservations();
    }

    @GetMapping("/getReservationById/{idReservation}")
    public Reservation getReservationById(@PathVariable Long idReservation) {
        return reservationService.retrieveReservation(idReservation);
    }

    @DeleteMapping("/DeleteReservation/{idReservation}")
    public void deleteReservation(@PathVariable Long idReservation) {
        reservationService.removeReservation(idReservation);
    }

    @PutMapping("/updateReservation")
    public Reservation updateReservation(@RequestBody Reservation r) {
        return reservationService.updateReservation(r);
    }
}
