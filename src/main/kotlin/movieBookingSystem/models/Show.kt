package movieBookingSystem.models

import java.time.LocalDateTime

class Show(val id: String, val startTime: LocalDateTime, val endTime: LocalDateTime, val cinemaHall: CinemaHall)