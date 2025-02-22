package com.jsteamkit.internals.steamlanguage;

import java.util.HashMap;
import java.util.Map;

public enum EResult {

    Invalid(0),
    OK(1),
    Fail(2),
    NoConnection(3),
    InvalidPassword(5),
    LoggedInElsewhere(6),
    InvalidProtocolVer(7),
    InvalidParam(8),
    FileNotFound(9),
    Busy(10),
    InvalidState(11),
    InvalidName(12),
    InvalidEmail(13),
    DuplicateName(14),
    AccessDenied(15),
    Timeout(16),
    Banned(17),
    AccountNotFound(18),
    InvalidSteamID(19),
    ServiceUnavailable(20),
    NotLoggedOn(21),
    Pending(22),
    EncryptionFailure(23),
    InsufficientPrivilege(24),
    LimitExceeded(25),
    Revoked(26),
    Expired(27),
    AlreadyRedeemed(28),
    DuplicateRequest(29),
    AlreadyOwned(30),
    IPNotFound(31),
    PersistFailed(32),
    LockingFailed(33),
    LogonSessionReplaced(34),
    ConnectFailed(35),
    HandshakeFailed(36),
    IOFailure(37),
    RemoteDisconnect(38),
    ShoppingCartNotFound(39),
    Blocked(40),
    Ignored(41),
    NoMatch(42),
    AccountDisabled(43),
    ServiceReadOnly(44),
    AccountNotFeatured(45),
    AdministratorOK(46),
    ContentVersion(47),
    TryAnotherCM(48),
    PasswordRequiredToKickSession(49),
    AlreadyLoggedInElsewhere(50),
    Suspended(51),
    Cancelled(52),
    DataCorruption(53),
    DiskFull(54),
    RemoteCallFailed(55),
    PasswordNotSet(56),
    PSNAccountNotLinked(57),
    InvalidPSNTicket(58),
    PSNAccountAlreadyLinked(59),
    RemoteFileConflict(60),
    IllegalPassword(61),
    SameAsPreviousValue(62),
    AccountLogonDenied(63),
    CannotUseOldPassword(64),
    InvalidLoginAuthCode(65),
    AccountLogonDeniedNoMailSent(66),
    HardwareNotCapableOfIPT(67),
    IPTInitError(68),
    ParentalControlRestricted(69),
    FacebookQueryError(70),
    ExpiredLoginAuthCode(71),
    IPLoginRestrictionFailed(72),
    AccountLocked(73),
    AccountLogonDeniedVerifiedEmailRequired(74);

    private int code;

    EResult(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    private static Map<Integer, EResult> values = new HashMap<>();
    static {
        for (EResult eResult : EResult.values()) {
            values.put(eResult.code, eResult);
        }
    }

    public static EResult get(int code) {
        return values.get(code);
    }
}
