package defpackage;

import android.content.UriMatcher;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class o68 extends tc4 {
    public static final UriMatcher e;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        e = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    @Override // defpackage.tc4
    public final void a(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    @Override // defpackage.tc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.ContentResolver r4, android.net.Uri r5) throws java.io.FileNotFoundException {
        /*
            r3 = this;
            android.content.UriMatcher r0 = defpackage.o68.e
            int r0 = r0.match(r5)
            r1 = 1
            if (r0 == r1) goto L52
            r2 = 3
            if (r0 == r2) goto L4d
            r2 = 5
            if (r0 == r2) goto L52
            boolean r0 = r3.a
            if (r0 == 0) goto L48
            boolean r0 = defpackage.r3.g(r5)
            if (r0 == 0) goto L48
            boolean r0 = defpackage.r3.f()
            if (r0 == 0) goto L48
            android.content.res.AssetFileDescriptor r4 = defpackage.r3.h(r4, r5)
            if (r4 == 0) goto L3c
            java.io.FileInputStream r4 = r4.createInputStream()     // Catch: java.io.IOException -> L2a
            goto L5c
        L2a:
            r5 = move-exception
            r4.close()     // Catch: java.lang.Exception -> L2e
        L2e:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r0 = "Unable to create stream"
            r4.<init>(r0)
            java.lang.Throwable r4 = r4.initCause(r5)
            java.io.FileNotFoundException r4 = (java.io.FileNotFoundException) r4
            throw r4
        L3c:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r0 = "FileDescriptor is null for: "
            java.lang.String r5 = defpackage.rm7.p(r5, r0)
            r4.<init>(r5)
            throw r4
        L48:
            java.io.InputStream r4 = r4.openInputStream(r5)
            goto L5c
        L4d:
            java.io.InputStream r4 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r4, r5, r1)
            goto L5c
        L52:
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.lookupContact(r4, r5)
            if (r0 == 0) goto L6b
            java.io.InputStream r4 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r4, r0, r1)
        L5c:
            if (r4 == 0) goto L5f
            return r4
        L5f:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r0 = "InputStream is null for "
            java.lang.String r5 = defpackage.rm7.p(r5, r0)
            r4.<init>(r5)
            throw r4
        L6b:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r5 = "Contact cannot be found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o68.b(android.content.ContentResolver, android.net.Uri):java.lang.Object");
    }

    @Override // defpackage.la1
    public final Class getDataClass() {
        return InputStream.class;
    }
}
