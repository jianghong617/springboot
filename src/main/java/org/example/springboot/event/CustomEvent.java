package org.example.springboot.event;

import org.springframework.context.ApplicationEvent;

/**
 * {@code CustomEvent}
 *
 * @author jianghong
 * @date 2023/09/18
 * @since 2.2.0
 */
public class CustomEvent extends ApplicationEvent {

    private static final long serialVersionUID = -2768916883382986730L;

    public CustomEvent(Object source) {
        super(source);
    }
}