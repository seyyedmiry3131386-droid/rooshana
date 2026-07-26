package com.google.firebase.installations;

import com.google.firebase.FirebaseException;
import defpackage.rq4;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {
        public static final /* synthetic */ Status[] a = {new Status("BAD_CONFIG", 0), new Status("UNAVAILABLE", 1), new Status("TOO_MANY_REQUESTS", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        Status EF5;

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) a.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseInstallationsException(String str) {
        super(str);
        rq4.l(str, "Detail message must not be empty");
    }
}
