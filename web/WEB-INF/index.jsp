<%@ page import="com.myproject.model.Program" %>
<%@ page import="com.myproject.model.Hotel" %>
<%@ page import="java.util.List" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head><title>My Project</title></head>
<body>
<h1>
</h1>

    <h1>
        Hotel deals
    </h1>
    <br>
select your Filter key:
    <select name="Type" size="1" form="carform">
        <option>destinationName</option>
        <option>destinationCity</option>
        <option>regionIds</option>
        <option>minTripStartDate</option>
        <option>lengthOfStay</option>
        <option>min/maxStarRating</option>
        <option>maxTotalRate</option>
        <option>min/maxGuestRating</option>
     </select>
    <br><br>
type your Filter value:
    <input  type="text" name="Value" form="carform" placeholder="Type to search">

    <input type="submit"  value="Filter" form="carform">
    <input type="submit"  value="Refresh" form="carform">
<br><br>
    <form method="get" action="index" id="carform">

        <%
            Program content = (Program) request.getAttribute("content");
        %>

        <table border="1">
            <thead>
            <tr>
                <th>siteID</th>
                <th>language</th>
                <th>currency</th>
                <th>userSelectedCurrency</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><%=content.getOfferInfo().getSiteID()%>
                </td>
                <td><%=content.getOfferInfo().getLanguage()%>
                </td>
                <td><%=content.getOfferInfo().getLanguage()%>
                </td>
                <td><%=content.getOfferInfo().getLanguage()%>
                </td>
            </tr>
            </tbody>
        </table>
        <br><br>
        <table border="1">
            <thead>
            <tr>
                <th>personaType</th>
                <th>userId</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><%=content.getUserInfo().getPersona().getPersonaType()%>
                </td>
                <td><%=content.getUserInfo().getUserId()%>
                </td>
            </tr>
            </tbody>
        </table>

        <br><br>
        <table border="1">
            <thead>
            <tr>
                <th>hotelImage</th>
                <th>hotelId</th>
                <th>hotelName</th>
                <th>localizedHotelName</th>
                <th>hotelDestination</th>
                <th>hotelDestinationRegionID</th>
                <th>hotelLongDestination</th>
                <th>hotelStreetAddress</th>
                <th>hotelCity</th>
                <th>hotelProvince</th>
                <th>hotelCountryCode</th>
                <th>hotelLatitude</th>
                <th>hotelLongitude</th>
                <th>travelStartDate</th>
                <th>travelEndDate</th>
                <th>lengthOfStay</th>
                <th>regionID</th>
                <th>associatedMultiCityRegionId</th>
                <th>longName</th>
                <th>shortName</th>
                <th>country</th>
                <th>city</th>
                <th>tla</th>
                 <th>hotelStarRating</th>
                <th>hotelGuestReviewRating</th>
                <th>hotelReviewTotal</th>
                <th>vipAccess</th>
                <th>isOfficialRating</th>
                <th>averagePriceValue</th>
                <th>totalPriceValue</th>
                <th>crossOutPriceValue</th>
                <th>originalPricePerNight</th>
                <th>currency</th>
                <th>percentSavings</th>
                <th>drr</th>
                <th>hotelInfositeUrl</th>
                <th>hotelSearchResultUrl</th>
               </tr>
            </thead>
            <tbody>
           <% List<Hotel> hotels = content.getOffers().getHotel();
                if( hotels == null)
                    out.print("No data Exist, try again");
           else {%>
            <% for (Hotel hotel : content.getOffers().getHotel()) { %>
            <tr>
                <td> <img src="<%=hotel.getHotelInfo().getHotelImageUrl()%>"></td>
                <td><%=hotel.getHotelInfo().getHotelId()%></td>
                <td><%=hotel.getHotelInfo().getHotelName()%></td>
                <td><%=hotel.getHotelInfo().getLocalizedHotelName()%></td>
                <td><%=hotel.getHotelInfo().getHotelDestination()%></td>
                <td><%=hotel.getHotelInfo().getHotelDestinationRegionID()%></td>
                <td><%=hotel.getHotelInfo().getHotelLongDestination()%></td>
                <td><%=hotel.getHotelInfo().getHotelStreetAddress()%></td>
                <td><%=hotel.getHotelInfo().getHotelCity()%></td>
                <td><%=hotel.getHotelInfo().getHotelProvince()%></td>
                <td><%=hotel.getHotelInfo().getHotelCountryCode()%></td>
                <td><%=hotel.getHotelInfo().getHotelLatitude()%></td>
                <td><%=hotel.getHotelInfo().getHotelLongitude()%></td>
                <td><%=hotel.getOfferDateRange().getTravelStartDate()%></td>
                <td><%=hotel.getOfferDateRange().getTravelEndDate()%></td>
                <td><%=hotel.getOfferDateRange().getLengthOfStay()%></td>
                <td><%=hotel.getDestination().getRegionID()%></td>
                <td><%=hotel.getDestination().getAssociatedMultiCityRegionId()%></td>
                <td><%=hotel.getDestination().getLongName()%></td>
                <td><%=hotel.getDestination().getShortName()%></td>
                <td><%=hotel.getDestination().getCountry()%></td>
                <td><%=hotel.getDestination().getCity()%></td>
                <td><%=hotel.getDestination().getTla()%></td>
                <td><%=hotel.getHotelInfo().getHotelStarRating()%></td>
                <td><%=hotel.getHotelInfo().getHotelGuestReviewRating()%></td>
                <td><%=hotel.getHotelInfo().getHotelReviewTotal()%></td>
                <td><%=hotel.getHotelInfo().getVipAccess()%></td>
                <td><%=hotel.getHotelInfo().getIsOfficialRating()%></td>
                <td><%=hotel.getHotelPricingInfo().getAveragePriceValue()%></td>
                <td><%=hotel.getHotelPricingInfo().getTotalPriceValue()%></td>
                <td><%=hotel.getHotelPricingInfo().getCrossOutPriceValue()%></td>
                <td><%=hotel.getHotelPricingInfo().getOriginalPricePerNight()%></td>
                <td><%=hotel.getHotelPricingInfo().getCurrency()%></td>
                <td><%=hotel.getHotelPricingInfo().getPercentSavings()%></td>
                <td><%=hotel.getHotelPricingInfo().getDrr()%></td>
                <td> <%=hotel.getHotelUrls().getHotelInfositeUrl()%>
                         </td>
                <td><%=hotel.getHotelUrls().getHotelSearchResultUrl()%></td>


            </tr>
            <% } %>
           <% } %>
            </tbody>

        </table>
       </form>


</body>
</html>