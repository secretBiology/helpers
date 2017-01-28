package com.secretbiology.helpers.general.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TextInputLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.MultiAutoCompleteTextView;

import com.secretbiology.helpers.general.R;

public class InputMultiAutoCompleteView extends LinearLayout {

    private String hint;
    private TextInputLayout layout;
    private MultiAutoCompleteTextView editText;
    private int inputType;

    /**
     * Constructors
     */
    public InputMultiAutoCompleteView(Context context, AttributeSet attrs) {
        super(context, attrs);
        extractAttribute(context, attrs);
    }

    public InputMultiAutoCompleteView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        extractAttribute(context, attrs);

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public InputMultiAutoCompleteView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        extractAttribute(context, attrs);

    }

    /**
     * Extract attribute from xml (if any)
     */
    private void extractAttribute(Context context, AttributeSet attrs) {
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.InputView);
        hint = a.getString(R.styleable.InputView_hint);
        inputType = a.getInt(R.styleable.InputView_android_inputType, EditorInfo.TYPE_CLASS_TEXT);
        a.recycle();
        build(context);
    }

    /**
     * Inflate the custom layout
     */
    private void build(Context context) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.com_secretbiology_multi_auto_input_view, this);
    }

    /**
     * Assign all view components just after inflating
     */
    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        layout = (TextInputLayout) this.findViewById(R.id.com_secretbiology_multi_auto_inputLayout);
        editText = (MultiAutoCompleteTextView) this.findViewById(R.id.com_secretbiology_multi_auto_input);
        setDefaults();
    }


    /**
     * Set default values of any given from xml
     */
    private void setDefaults() {
        if (hint != null) {
            layout.setHint(hint);
        }

        editText.setInputType(inputType);


    }

    /**
     * Putblic methods for view
     */
    public void setHint(String hint) {
        layout.setHint(hint);
    }

    public String getHint() {
        return hint;
    }

    public void setError(String error) {
        layout.setError(error);
    }

    public void setErrorEnabled(boolean value) {
        layout.setErrorEnabled(value);
    }

    public void setText(String text) {
        editText.setText(text);
    }

    public void getFocus(Context context) {
        if (editText.requestFocus()) {
            InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT);
        }
    }

    public String getText() {
        return editText.getText().toString();
    }

    public boolean isEmpty() {
        return getText().length() == 0;
    }

    public void setTextSize(float size) {
        editText.setTextSize(size);
    }

    public void setBackgroundColor(int ReSourceID) {
        editText.setBackgroundColor(ReSourceID);
    }

    public TextInputLayout getLayout() {
        return layout;
    }

    public MultiAutoCompleteTextView getEditText() {
        return editText;
    }

    public int getInputType() {
        return inputType;
    }
}