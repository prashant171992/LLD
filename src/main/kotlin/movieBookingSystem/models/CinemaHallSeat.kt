package movieBookingSystem.models

class CinemaHallSeat(val id: String, val seatType: SeatType, val row: String, val column: String)

enum class SeatType {
    REGULAR, PREMIUM, RECLINER
}
