package com.google.firebase.installations.local;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class PersistedInstallation$RegistrationStatus {
    public static final PersistedInstallation$RegistrationStatus a;
    public static final PersistedInstallation$RegistrationStatus b;
    public static final PersistedInstallation$RegistrationStatus c;
    public static final PersistedInstallation$RegistrationStatus d;
    public static final PersistedInstallation$RegistrationStatus e;
    public static final /* synthetic */ PersistedInstallation$RegistrationStatus[] f;

    static {
        PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus = new PersistedInstallation$RegistrationStatus("ATTEMPT_MIGRATION", 0);
        a = persistedInstallation$RegistrationStatus;
        PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus2 = new PersistedInstallation$RegistrationStatus("NOT_GENERATED", 1);
        b = persistedInstallation$RegistrationStatus2;
        PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus3 = new PersistedInstallation$RegistrationStatus("UNREGISTERED", 2);
        c = persistedInstallation$RegistrationStatus3;
        PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus4 = new PersistedInstallation$RegistrationStatus("REGISTERED", 3);
        d = persistedInstallation$RegistrationStatus4;
        PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus5 = new PersistedInstallation$RegistrationStatus("REGISTER_ERROR", 4);
        e = persistedInstallation$RegistrationStatus5;
        f = new PersistedInstallation$RegistrationStatus[]{persistedInstallation$RegistrationStatus, persistedInstallation$RegistrationStatus2, persistedInstallation$RegistrationStatus3, persistedInstallation$RegistrationStatus4, persistedInstallation$RegistrationStatus5};
    }

    public static PersistedInstallation$RegistrationStatus valueOf(String str) {
        return (PersistedInstallation$RegistrationStatus) Enum.valueOf(PersistedInstallation$RegistrationStatus.class, str);
    }

    public static PersistedInstallation$RegistrationStatus[] values() {
        return (PersistedInstallation$RegistrationStatus[]) f.clone();
    }
}
