package movieBookingSystem.models

class Account (val userId: String, val type: AccountType, val status: AccountStatus)

class User (val userId: String, val name: String, val address: String, val emailId: String, val phoneNumber: String)

enum class AccountStatus {
    ACTIVE, CLOSED, BLACKLISTED
}

enum class AccountType {
    ADMIN, CUSTOMER, GUEST
}
