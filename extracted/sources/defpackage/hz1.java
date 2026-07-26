package defpackage;

import android.adservices.topics.EncryptedTopic;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.text.StaticLayout;
import android.view.inputmethod.EditorInfo;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public abstract class hz1 {
    public static js2 a(GetTopicsResponse getTopicsResponse) {
        js3.p(getTopicsResponse, "response");
        ArrayList arrayList = new ArrayList();
        for (Topic topic : getTopicsResponse.getTopics()) {
            arrayList.add(new jo8(topic.getTaxonomyVersion(), topic.getTopicId(), topic.getModelVersion()));
        }
        return new js2(arrayList, EmptyList.a);
    }

    public static js2 b(GetTopicsResponse getTopicsResponse) {
        js3.p(getTopicsResponse, "response");
        ArrayList arrayList = new ArrayList();
        for (Topic topic : getTopicsResponse.getTopics()) {
            arrayList.add(new jo8(topic.getTaxonomyVersion(), topic.getTopicId(), topic.getModelVersion()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (EncryptedTopic encryptedTopic : getTopicsResponse.getEncryptedTopics()) {
            byte[] encryptedTopic2 = encryptedTopic.getEncryptedTopic();
            js3.o(encryptedTopic2, "encryptedTopic.encryptedTopic");
            String keyIdentifier = encryptedTopic.getKeyIdentifier();
            js3.o(keyIdentifier, "encryptedTopic.keyIdentifier");
            byte[] encapsulatedKey = encryptedTopic.getEncapsulatedKey();
            js3.o(encapsulatedKey, "encryptedTopic.encapsulatedKey");
            arrayList2.add(new v12(encryptedTopic2, keyIdentifier, encapsulatedKey));
        }
        return new js2(arrayList, arrayList2);
    }

    public static final void c(StaticLayout.Builder builder) {
        builder.setUseBoundsForWidth(false);
    }

    public static void d(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static void e(EditorInfo editorInfo, boolean z) {
        editorInfo.setStylusHandwritingEnabled(z);
    }
}
