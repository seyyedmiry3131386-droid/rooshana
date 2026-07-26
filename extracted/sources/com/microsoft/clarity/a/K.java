package com.microsoft.clarity.a;

import com.microsoft.clarity.models.PageMetadata;
import com.microsoft.clarity.models.SessionMetadata;
import com.microsoft.clarity.models.display.blobs.TextBlob;
import com.microsoft.clarity.models.display.images.Image;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class K {
    public static final Image a;
    public static final TextBlob b;

    static {
        new PageMetadata(new SessionMetadata("DUMMY", "DUMMY", "DUMMY", "DUMMY", 0L, 1, false, "https://www.clarity.ms/eus2/", null, null, 768, null), 0);
        a = new Image(null, new byte[0], null, null);
        b = new TextBlob(null, EmptyList.a);
    }
}
