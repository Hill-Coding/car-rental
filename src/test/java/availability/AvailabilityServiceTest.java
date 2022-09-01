package availability;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

class AvailabilityServiceTest {

    @Test
    void shouldReturnTrueForOverlappingDates() {
        // given
        LocalDateTime s1 = LocalDateTime.of(2022, 9, 1, 0, 0);
        LocalDateTime e1 = LocalDateTime.of(2022, 9, 30, 0, 0);
        LocalDateTime s2 = LocalDateTime.of(2022, 9, 5, 0, 0);
        LocalDateTime e2 = LocalDateTime.of(2022, 9, 11, 0, 0);

        // when
        boolean isOverlapping = AvailabilityService.isOverlapping(s1, e1, s2, e2);
        // then
        assertThat(isOverlapping).isTrue();
    }

    @Test
    void shouldReturnFalseForNotOverlappingDates() {
        // given
        LocalDateTime s1 = LocalDateTime.of(2022, 9, 1, 0, 0);
        LocalDateTime e1 = LocalDateTime.of(2022, 9, 10, 0, 0);
        LocalDateTime s2 = LocalDateTime.of(2022, 9, 15, 0, 0);
        LocalDateTime e2 = LocalDateTime.of(2022, 9, 30, 0, 0);
        // when
        boolean isOverlapping = AvailabilityService.isOverlapping(s1, e1, s2, e2);
        // then
        assertThat(isOverlapping).isFalse();
    }
}