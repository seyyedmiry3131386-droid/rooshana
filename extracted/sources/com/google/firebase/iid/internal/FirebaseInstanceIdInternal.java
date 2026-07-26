package com.google.firebase.iid.internal;

import defpackage.bf8;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface FirebaseInstanceIdInternal {

    public interface NewTokenListener {
        void onNewToken(String str);
    }

    void addNewTokenListener(NewTokenListener newTokenListener);

    void deleteToken(String str, String str2) throws IOException;

    String getId();

    String getToken();

    bf8 getTokenTask();
}
