### Fixed
- Update sizes and SizeAdjuster on every check due to possible URL change. [Trello 1353](https://trello.com/c/rhTs54Kb)

## [3.160.0] - 2020-01-30
### Fixed
- Misaligned coded regions. [Trello 1504](https://trello.com/c/ob3kzcDR)
- Fixed long-request implementation in all 3 connectivity packages. [Trello 1516](https://trello.com/c/GThsXbIL)
### Updated
- All Eyes related commands now enable long-request. [Trello 1516](https://trello.com/c/GThsXbIL)

## [3.159.0] - 2020-01-21
### Updated
- Capture scripts. [Trello 151](https://trello.com/c/owyVIQG9)
- Upload images directly to storage service on MatchWindow. [Trello 1461](https://trello.com/c/1V5X9O37)
- Visual Grid: Added older versions support for Chrome, Firefox and Safari browsers. [Trello 1479](https://trello.com/c/kwsR1zql)

### Fixed
- Added missing method: abortAsync. [Trello 1420](https://trello.com/c/3NOKuLLj)
- Fixed viewport computation on edge cases.
- Some special characters are not rendering on Visual Grid. [Trello 1443](https://trello.com/c/GWzVCY7W)
- Fixed default match settings being incorrectly overriden by image match settings. [Trello 1495](https://trello.com/c/KEbWXavV)

## [3.158.9] - 2019-12-12
### Fixed
- Fixed ensuring eyes open before check. [Trello 722](https://trello.com/c/JgXaAhPo)
- Fixed creation of new Rest client when closing batches. [Trello 1327](https://trello.com/c/Jdoj8AQ9) 
- Disabled ImageDeltaCompressor. [Trello 1361](https://trello.com/c/AZiEB8bP) 
- Added new stitchingServiceUrl field to RenderingInfo and RenderRequest [Trello 1368](https://trello.com/c/RkBRBJCu) 
- Unrecognized fields in server response JSON are ignored. [Trello 1375](https://trello.com/c/RqYEUoIq) 

## [3.158.8] - 2019-11-22
### Fixed
- Calling updated methods in DOM Snapshot. [Trello 375](https://trello.com/c/elkaV9Dm)

## [3.158.7] - 2019-11-22
### Fixed
- Updated DOM snapshot script. [Trello 375](https://trello.com/c/elkaV9Dm)

## [3.158.6] - 2019-11-13
### Fixed
- Fixed connection pool hanging with DomCapture. [Trello 1144](https://trello.com/c/Aex0NkjK) 

## [3.158.5] - 2019-11-08
### Fixed
- CSS scrolling in chrome 78. [Trello 1206](https://trello.com/c/euVqe1Sv) 

## [3.158.4] - 2019-10-23
### Fixed
- Jersey1x proxy.

## [3.158.3] - 2019-10-19
### Fixed
- DOM-Snapshot correct close of resource download response.

## [3.158.2] - 2019-10-10
### Fixed
- Updated accessibility enums (experimental).

## [3.158.1] - 2019-10-10
### Added 
- Batch close & notification support for JBoss and Jersey1x.
### Fixed
- Batch close now checks for bamboo_ prefix for env var.

## [3.158.0] - 2019-10-10
### Added 
- Accessibility support [experimental].
- Batch close & notification support.

## [3.157.12] - 2019-07-27
### Added 
- This CHANGELOG file.
### Fixed
- Bugfix: Creating screenshots correctly when IEDriver provides a full page without being requested to do so.