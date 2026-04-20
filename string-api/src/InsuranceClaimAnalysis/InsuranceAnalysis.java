package InsuranceClaimAnalysis;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class InsuranceAnalysis {
    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
                new Claim("Health", 5000),
                new Claim("Vehicle", 12000),
                new Claim("Health", 7000),
                new Claim("Property", 20000),
                new Claim("Vehicle", 8000)
        );

        Map<String, Double> avgClaim =
                claims.stream()
                        .collect(groupingBy(
                                Claim::getType,
                                averagingDouble(Claim::getAmount)
                        ));

        avgClaim.forEach((type, avg) ->
                System.out.println(type + " -> " + avg));
    }
}
