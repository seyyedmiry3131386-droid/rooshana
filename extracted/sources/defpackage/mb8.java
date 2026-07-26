package defpackage;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes3.dex */
public final class mb8 extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (webView != null) {
            webView.evaluateJavascript("(function() {\n    const targetNode = document.body; // Or a more specific element\n    const config = { childList: true, subtree: true };\n\n    const callback = function(mutationsList, observer) {\n        for(const mutation of mutationsList) {\n            if (mutation.type === 'childList') {\n                // Check if the added nodes contain the content you're looking for\n                // For example, check for a specific class or ID\n                // If content is detected, call the Android interface\n                // observer.disconnect(); // Stop observing if content is found\n                // window.AndroidContentObserver.onContentLoaded(); // Call Android method\n                // For a simpler case, you might just wait for a certain period of inactivity\n                clearTimeout(window.contentLoadTimer);\n                window.contentLoadTimer = setTimeout(() => {\n                    window.AndroidContentObserver.onContentLoaded();\n                    observer.disconnect();\n                }, 500); // Adjust inactivity timeout\n            }\n        }\n    };\n\n    const observer = new MutationObserver(callback);\n    observer.observe(targetNode, config);\n\n    // Optional: Set a timeout in case the observer never triggers (e.g., if content is not added dynamically)\n     window.contentLoadTimeout = setTimeout(() => {\n         observer.disconnect();\n         window.AndroidContentObserver.onContentLoaded(); // Assume content is loaded after timeout\n     }, 10000); // Adjust timeout\n})();", null);
        }
    }
}
